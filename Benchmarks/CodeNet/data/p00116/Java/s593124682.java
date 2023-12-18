/* Rectangular Seaching */
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
			String[] dst = line.split(" ");
			int h = Integer.parseInt(dst[0]);
			int w = Integer.parseInt(dst[1]);

			if(w == 0 && h == 0){
				break;
			}

			String[][] data = new String[h][w];
			for(int j=0; j<h; j++){
				line = in.readLine();
				for(int i=0; i<w; i++){
					data[j][i] = line.substring(i, i+1);
				}
			}

			int S = 0;
			//ツ縦ツ陛サツ古シツ優ツ静ヲツ探ツ催オ
			for(int j=0; j<h; j++){
				for(int i=0; i<w; i++){
					if(data[j][i].equals(".")){
						for(int y=1; y<=h-j; y++){
							for(int x=1; x<=w-i; x++){
								if(isOK(data, i, j, x, y)){
									if(S < x*y){
										S = x*y;
									}
								}
							}
						}
					}
				}
			}

			Ans.add(S);
		}

		for(int i=0; i<Ans.size(); i++){
			System.out.println(Ans.get(i));
		}
	}

	public boolean isOK(String[][] data, int x, int y, int w, int h){
		for(int j=y; j<y+h; j++){
			for(int i=x; i<x+w; i++){
				if(data[j][i].equals("*")){
					return false;
				}
			}
		}

		return true;

	}
}