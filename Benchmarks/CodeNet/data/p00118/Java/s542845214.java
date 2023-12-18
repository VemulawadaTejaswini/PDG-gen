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

	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> Ans = new ArrayList<Integer>();
		String line;

		while((line = in.readLine()) != null){
			if(line.equals("")){
				continue;
			}

			String[] dst = line.split(" +");
			int h = Integer.parseInt(dst[0]);
			int w = Integer.parseInt(dst[1]);

			if(h==0 && w==0){
				break;
			}

			String[][] data = new String[h][w];
			int[][] label = new int[h][w];
			for(int j=0; j<h; j++){
				line = in.readLine();
				for(int i=0; i<w; i++){
					data[j][i] = line.substring(i, i+1);
					label[j][i] = 0;
				}
			}

			int count = 0;
			for(int j=0; j<h; j++){
				for(int i=0; i<w; i++){
					if(label[j][i] == 0){
						count++;
						label[j][i] = count;
						grouping(data, label, w, h, i, j);
					}
				}
			}

			Ans.add(count);
		}

		for(int n=0; n<Ans.size(); n++){
			System.out.println(Ans.get(n));
		}
	}

	public void grouping(String[][] data, int[][] label, int w, int h, int x, int y){
		int[][] offset = new int[][]{
				{-1, 0}, {1, 0}, {0, -1}, {0, 1}
		};

		for(int n=0; n<4; n++){
			int i = x + offset[n][0];
			int j = y + offset[n][1];
			if(i>=0 && j>=0 && i<w && j<h){
				if(label[j][i] == 0){
					if(data[j][i].equals(data[y][x])){
						label[j][i] = label[y][x];
						grouping(data, label, w, h, i, j);
					}
				}
			}
		}
	}
}