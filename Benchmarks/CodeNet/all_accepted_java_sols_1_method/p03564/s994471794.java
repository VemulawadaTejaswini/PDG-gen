import java.util.Scanner;

import javax.sql.rowset.serial.SerialArray;

public class Main {

		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);

			int N = sc.nextInt();
			int K = sc.nextInt();

			int ans = 1;
		    for(int i = 0; i < N; i += 1){
		        if(ans < K){
		        	ans = ans * 2;
		        }else{
		        	ans = ans + K ;
		        }
		    }
		    System.out.println(ans);

		}
}
