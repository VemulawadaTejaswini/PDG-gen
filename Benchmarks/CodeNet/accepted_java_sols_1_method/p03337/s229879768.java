import java.util.Scanner;

import javax.sql.rowset.serial.SerialArray;

public class Main {

		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);

			
			int A = sc.nextInt();
			int B = sc.nextInt();

			int ans = 0;
			int ans_max = 0;
			
			ans_max = A + B;
			
			ans = A - B;
			if(ans > ans_max){
			    ans_max = ans;
			}
			
			ans = A * B;
			if(ans > ans_max){
			    ans_max = ans;
			}

		    System.out.println(ans_max);
		    return ;
		}
}
