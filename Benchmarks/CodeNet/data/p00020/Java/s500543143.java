import java.io.*;
import java.util.*;
import java.lang.String;

class Main{
				
		public static void main(String args[]) throws IOException{
			String str;

			Scanner scan = new Scanner(System.in);
			
			scan.useDelimiter("\n");
			
			while(scan.hasNext()){
				str = scan.next();
				str = str.toUpperCase();
				System.out.println(str);
			}
		}
}