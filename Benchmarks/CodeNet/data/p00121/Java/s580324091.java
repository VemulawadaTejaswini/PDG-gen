import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;

		int[] pat = puzzle();

		while((line = in.readLine()) != null){
			String[] dst = line.split(" ");
			int size = dst.length;
			int[] data = new int[size];
			for(int i=0; i<size; i++){
				data[i] = Integer.parseInt(dst[i]);
			}

			System.out.println(pat[toNum(data)]-1);
		}
	}

	public int[] puzzle(){
		List<int[]> que = new ArrayList<int[]>();
		int[] pat = new int[16434825];
		int[] init = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
		pat[toNum(init)] = 1;
		que.add(init);
		int[][] swap = new int[][]{
				{0, 1}, {1, 2}, {2, 3},
				{4, 5}, {5, 6}, {6, 7},
				{0, 4}, {1, 5}, {2, 6}, {3, 7}
		};

		while(que.size() != 0){
			int[] item = que.get(0);
			que.remove(0);
			int c = pat[toNum(item)]+1;
			for(int i=0; i<10; i++){
				if(item[swap[i][0]]==0 || item[swap[i][1]]==0){
					int[] dst = deepClone(item);
					int t = dst[swap[i][0]];
					dst[swap[i][0]] = dst[swap[i][1]];
					dst[swap[i][1]] = t;
					int index = toNum(dst);
					if(pat[index] == 0){
						pat[index] = c;
						que.add(dst);
					}
				}
			}
		}
		return pat;
	}

	public int toNum(int[] data){
		int x = 0;
		for(int i=0; i<data.length; i++){
			x <<= 3;
			x += data[i];
		}

		return x;
	}

	public int[] deepClone(int[] data){
		int n = data.length;
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			a[i] = data[i];
		}
		return a;
	}
}