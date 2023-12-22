import java.util.Scanner;

import javax.sql.rowset.serial.SerialArray;

public class Main {

		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			// スペース区切りの整数の入力
			String a = sc.next();
			String[] strArray = a.split("");
			
			String b = strArray[3] + strArray[2] + strArray[1];
			
			if (a.equals(b)){
				System.out.println("Yes");
			    return;
			}
			
			System.out.println("No");

		}
}
