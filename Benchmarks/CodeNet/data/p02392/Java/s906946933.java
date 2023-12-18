import static java.lang.System.*;

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			if((a < b) &&(b < c))
				out.println("Yes");
			else
				out.println("NO");
		}finally{
			if(scan !=null)scan.close();
		}

	}
}