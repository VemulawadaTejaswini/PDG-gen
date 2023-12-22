
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			String S = sc.next();
			sc.close();
			
			int count = 0;
			int length = S.length();
			int k = 15-length;
			for (int i=0; i<length; i++){
				 if (S.charAt(i)=='o'){
					 count++;
				 }
					 
			 }
			 if (k+count>7)
				 System.out.println("YES");
			 else
				 System.out.println("NO");
				 
	}

}
