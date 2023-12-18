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
		List<String> ans = new ArrayList<String>();

		String line;
		while((line = in.readLine()) != null){
			String[] dst = line.split(" ");
			int x = 0;
			int y = 0;
			int h = Integer.parseInt(dst[0]);
			int w = Integer.parseInt(dst[1]);

			if(w==0 && h==0){
				break;
			}

			String[][] data = new String[h][w];
			for(int j=0; j<h; j++){
				line = in.readLine();
				for(int i=0; i<w; i++){
					data[j][i] = line.substring(i, i+1);
				}
			}

			int step = 0;
			String tile = null;
			while(true){
				tile = data[y][x];

				if(tile.equals(">")){
					x++;
				}
				else if(tile.equals("<")){
					x--;
				}
				else if(tile.equals("v")){
					y++;
				}
				else if(tile.equals("^")){
					y--;
				}
				else if(tile.equals(".")){
					ans.add(Integer.toString(x) + " " + Integer.toString(y));
					break;
				}

				step++;
				if(step > w*h+1){
					//System.out.println(step);
					ans.add("LOOP");
					break;
				}
			}
		}

		for(int i=0; i<ans.size(); i++){
			System.out.println(ans.get(i));
		}
	}
}