import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 String str = scan.nextLine();
		 
		 int  flag = 0;
		 
		 for (int i = 1; i < 4; i++ ) {
			if (str.charAt(i) == str.charAt(i-1)) {
				flag = 1;
			}
		 }
		 
		 if (flag == 1) {
			 System.out.println("Bad");
		 } else {
			 System.out.println("Good");
		 }
		 
		 scan.close();
		 

	}

}
