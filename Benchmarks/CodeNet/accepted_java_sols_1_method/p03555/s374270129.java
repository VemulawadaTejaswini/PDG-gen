import java.util.Scanner;

import javax.sql.rowset.serial.SerialArray;

public class Main {

		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);

			
			String name1 = sc.next();
			String name2 = sc.next();

			StringBuffer sb = new StringBuffer(name1);
	        name1 = sb.reverse().toString();
	        
	        if(name1.endsWith(name2)){
			    System.out.println("YES");
	        }else{
			    System.out.println("NO");
	        }
		}
}
