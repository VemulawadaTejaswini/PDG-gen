import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int[][][] house = new int[4][3][10];
		
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<10;k++){
					house[i][j][k]=0;
				}
			}
		}
		
		int n = Integer.parseInt(input);
		
		for(int i=0;i<n;i++){
			String[] date = br.readLine().split(" ");
			
			int mune = Integer.parseInt(date[0])-1;
			int kai = Integer.parseInt(date[1])-1;
			int heya = Integer.parseInt(date[2])-1;
			int hito = Integer.parseInt(date[3]);
			
			house[mune][kai][heya] += hito;
			
		}
		
		for(int i=0;i<4;i++){
			if(i != 0){
				System.out.println("####################");
			}
			for(int j=0;j<3;j++){
				
				for(int k=0;k<10;k++){
					System.out.print(" ");
					System.out.print(house[i][j][k]);
					
				}
				System.out.println();
			}
		}
		
		
		
	}
}