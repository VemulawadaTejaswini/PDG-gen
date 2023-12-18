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


	public Main() throws IOException, StackOverflowError{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> Ans = new ArrayList<Integer>();
		String line = in.readLine();
		String[] dst = line.split(" ");
		Integer.parseInt(dst[0]);

		
	}

	public void grouping(int[][] data, int[][] label, int x, int y){
		List<point> cue = new ArrayList<point>();
		cue.add(new point(x, y));
		while(cue.size() != 0){
			point p = cue.get(0);
			cue.remove(0);
			for(int d=0; d<4; d++){
				int xx = p.x + offset[d][0];
				int yy = p.y + offset[d][1];
				if(label[yy][xx] == 0 && data[yy][xx] == data[p.y][p.x]){
					label[yy][xx] = label[p.y][p.x];
					cue.add(new point(xx, yy));
				}
			}
		}
	}
}

class point{
	int x;
	int y;
	
	public point(int x, int y){
		this.x = x;
		this.y = y;
	}
}