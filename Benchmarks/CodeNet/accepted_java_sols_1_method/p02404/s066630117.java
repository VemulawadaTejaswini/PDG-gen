import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String[] input = br.readLine().split(" ");
			int H = Integer.parseInt(input[0]);
			int W = Integer.parseInt(input[1]);			
			if ((H == 0) && (W == 0)){
				break;
			}
			for (int j = 1; j <= W; j++){
				System.out.print("#");
			}
			System.out.println("");
			for (int i = 2; i <= H - 1; i++){
				System.out.print("#");
				for (int j = 2; j <= W - 1; j++){
					System.out.print(".");
				}
				System.out.println("#");
			}
			for (int j = 1; j <= W; j++){
				System.out.print("#");
			}
			System.out.println("");
			System.out.println("");
		}
		
	}
}