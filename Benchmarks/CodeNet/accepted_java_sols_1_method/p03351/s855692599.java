import java.util.Scanner;

import javax.sql.rowset.serial.SerialArray;

public class Main {

		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);

			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();

			int ans = 0;
			ans = Math.abs(a - c) ;
			if(ans <= d){
			    System.out.println("Yes");
			    return ;
			}
			
			int ans2 = Math.abs(a - b) ;
			
			int ans3 = Math.abs(c - b) ;
			
			if((ans2 <= d ) & (ans3 <= d )) {
			    System.out.println("Yes");
			    return ;
			}

		    System.out.println("No");
		    return ;
		}
}
