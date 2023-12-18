import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

 	public static void main(String[] args) throws IOException{
		// TODO ?????????????????????????????????????????????
 		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		      String str = br.readLine();
		   String[] stAry = str.split(" ");
		   int a = Integer.parseInt(stAry[0]);
		   int b = Integer.parseInt(stAry[1]);
		   
	
			while ( a !=0 || b!=0){
			for (int i = 0; i < a; i++){
				for (int j = 0; j < b; j++){
					if (i == 0 || i == a-1 || j == 0 || j == b-1)
						System.out.printf("#");
					else
						System.out.printf(".");
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");
			
		    str = br.readLine();
		    str.split(" ");
		   a = Integer.parseInt(stAry[0]);
		   b = Integer.parseInt(stAry[1]);
		}
 	}
}