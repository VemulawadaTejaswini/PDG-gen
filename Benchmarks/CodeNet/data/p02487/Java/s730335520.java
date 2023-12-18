import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public void draw(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str;
		while(true){
			try {
				str = br.readLine().split(" ");
				int h = Integer.parseInt(str[0]);
				int w = Integer.parseInt(str[1]);
				
				if(h==0 && w==0){ break; }
				
				String[][] sq = new String[h][w];
				
				for(int i=0; i<h; i++){
					for(int j=0; j<w; j++){
						sq[i][j] = "#";
					}
				}
				for(int i=1; i<h-1; i++){
					for(int j=1; j<w-1; j++){
						sq[i][j] = ".";
					}
				}
				for(int i=0; i<h; i++){
					for(int j=0; j<w; j++){
						System.out.print(sq[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args){
		new Main2().draw();
	}
}