import java.util.Scanner;

import javax.sql.rowset.serial.SerialArray;

public class Main {

		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);

			int X = sc.nextInt();
			int Y = sc.nextInt();
			int Z = sc.nextInt();

			X = X - Z;
			int hito = Y + Z;
			int ans1 = X / hito ;
			int work = X % hito;
			if (work < X){
				System.out.println(ans1);
			}else{	
				System.out.println(ans1 + 1);
			}


		}
}
