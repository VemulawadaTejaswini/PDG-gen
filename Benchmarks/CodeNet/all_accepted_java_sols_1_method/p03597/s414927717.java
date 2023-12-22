import java.util.Scanner;

import javax.sql.rowset.serial.SerialArray;

public class Main {

		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);

			int N = sc.nextInt();
			int A = sc.nextInt();
			
			int men = N * N - A ;
		    System.out.println(men);

		}
}
