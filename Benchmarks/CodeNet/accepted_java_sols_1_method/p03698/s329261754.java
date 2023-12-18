import java.util.Scanner;

import javax.sql.rowset.serial.SerialArray;

public class Main {

		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			// スペース区切りの整数の入力
			String str = sc.next();
			String[] strArray = str.split("");
			 
			for (int i = 0; i < strArray.length; i++) {
				for (int j = i + 1; j < strArray.length; j++) {
				    // 1文字ずつ表示
			        if (strArray[i].toString().equals(strArray[j].toString())){
					    System.out.println("no");
			    	    return;
			        }
				}
			}
			
			System.out.println("yes");

		}
}
