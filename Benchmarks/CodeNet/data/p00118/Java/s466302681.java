import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException err){
			err.printStackTrace();
		}
	}
	
	int[][] offset = new int[][]{
			{-1, 0}, {1, 0}, {0, -1}, {0, 1}
	};


	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> Ans = new ArrayList<Integer>();
		String line;

		while((line = in.readLine()) != null){
			String[] dst = line.split("ツ　");
			int h = Integer.parseInt(dst[0]);
			int w = Integer.parseInt(dst[1]);


			
		}

		for(int n=0; n<Ans.size(); n++){
			System.out.println(Ans.get(n));
		}
	}

	public void grouping(int[][] data, int[][] label, int w, int h, int x, int y){
		for(int n=0; n<4; n++){
			int i = x + offset[n][0];
			int j = y + offset[n][1];
			if(label[j][i] == 0){
				if(data[j][i] == data[y][x]){
					label[j][i] = label[y][x];
					grouping(data, label, w, h, i, j);
				}
			}
		}
	}
}