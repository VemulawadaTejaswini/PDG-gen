import java.util.Scanner;

import javax.sql.rowset.serial.SerialArray;

public class Main {

		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);

			
			int X = sc.nextInt();

			int ans = 0;
			int max = 0;
			double d = Math.sqrt(X);
			
			int wki = (int) Math.floor(d);
			
			for(int i = 1;i <= wki;i++){
				for(int j = 1;j <= wki;j++){
					ans = (int) Math.pow(i, j);
					if(X < ans ) {
						j = wki;
					}else{
						if(max < ans){
							max = ans;
						}
					}
				}
			}
			
			if (max == 0){
			    System.out.println(X);
			    return ;
				
			}
		    System.out.println(max);
		    return ;
		}
			
}
