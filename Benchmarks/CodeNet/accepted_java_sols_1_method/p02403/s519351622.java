import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException{

		int[] H = new int[1000];
		int[] W = new int[1000];
		String[] Buffer = new String[10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		for(int n = 0; n<1000; n++){
			Buffer = br.readLine().split(" ");
			H[n] = Integer.parseInt(Buffer[0]);
			W[n] = Integer.parseInt(Buffer[1]);
			//System.out.println("your input is: "+n+" "+H[n]+" "+W[n]);
			if(H[n]==0 && W[n]==0){
				n = 1000;
			}
		}
		
 		int k = 0;
 		while(H[k]!=0 && W[k]!=0){
 			for(int n = 0; n< H[k]; n++){
 				for(int m = 0; m< W[k]; m++){
 					System.out.print("#");
 				}
 				System.out.print("\n");
 			}
 			k++;
 			System.out.print("\n");
 		}

	}
}