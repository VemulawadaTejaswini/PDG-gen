import java.util.Scanner;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		int[][] map = new int[14][14];
		int max = 0;
		int count = 100;
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				String str = stdIn.next();
				String[] p = new String[3];
				p = str.split(",");
				int[] s = new int[3];
				for(int i = 0; i < 3; i++){
					s[i] = Integer.parseInt(p[i]);
				}
				
				if( s[2] == 1 ){
					map[s[0]+2][s[1]+2]++; map[s[0]+3][s[1]+2]++; map[s[0]+1][s[1]+2]++;
					map[s[0]+2][s[1]+3]++; map[s[0]+2][s[1]+1]++;
				} else if( s[2] == 2 ){
					map[s[0]+2][s[1]+2]++; map[s[0]+1][s[1]+1]++; map[s[0]+2][s[1]+1]++;
					map[s[0]+3][s[1]+1]++; map[s[0]+1][s[1]+2]++; map[s[0]+3][s[1]+2]++;
					map[s[0]+1][s[1]+3]++; map[s[0]+2][s[1]+3]++; map[s[0]+3][s[1]+3]++;
				} else if( s[2] == 3 ){
					map[s[0]+2][s[1]+2]++; map[s[0]+1][s[1]+1]++; map[s[0]+2][s[1]+1]++;
					map[s[0]+3][s[1]+1]++; map[s[0]+1][s[1]+2]++; map[s[0]+3][s[1]+2]++;
					map[s[0]+1][s[1]+3]++; map[s[0]+2][s[1]+3]++; map[s[0]+3][s[1]+3]++;
					map[s[0]][s[1]+2]++; map[s[0]+4][s[1]+2]++; map[s[0]+2][s[1]]++;
					map[s[0]+2][s[1]+4]++;
				}
			}
			
			for(int i = 2; i < 12; i++){
				for(int j = 2; j < 12; j++){
					if( map[i][j] != 0 ){
						count--;
						if( map[i][j] > max ){
							max = map[i][j];
						}
					}
				}
			}
			
			System.out.println(count);
			System.out.println(max);	
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}