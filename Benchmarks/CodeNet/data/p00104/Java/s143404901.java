import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		while(!(str=br.readLine()).equals("0 0")){
			int h = Integer.parseInt(str.substring(0, str.indexOf(" ")));
			int w = Integer.parseInt(str.substring(str.indexOf(" ")+1, str.length()));

			char tiles[][] = new char[h][w];
			int count[][] = new int[h][w];

			for(int i=0; i<h; i++){
				tiles[i] = br.readLine().toCharArray();
			}

			behavior(tiles, count);
		}

	}

	static void behavior(char tiles[][], int count[][]){
		int sw=0,sh=0;

		while(true){
			if(tiles[sh][sw] == '>'){
				sw++;
				count[sh][sw]++;
			}else if(tiles[sh][sw] == '<'){
				sw--;
				count[sh][sw]++;
			}else if(tiles[sh][sw] == '^'){
				sh--;
				count[sh][sw]++;
			}else if(tiles[sh][sw] == 'v'){
				sh++;
				count[sh][sw]++;
			}else if(tiles[sh][sw] == '.'){
				System.out.println(sw + " " + sh);
				break;
			}
			if(count[sh][sw] == 2){
				System.out.println("LOOP");
				break;
			}
		}
	}

}