import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 String msg = "No";
		 
		 String str = scan.nextLine();
		 if (str.charAt(0) == str.charAt(1)) {
			 if (str.charAt(2) == str.charAt(3) && str.charAt(0) != str.charAt(2)) {
				 msg = "Yes";
			 }
		 }
		 else if (str.charAt(0) == str.charAt(2)) {
			 if (str.charAt(1) == str.charAt(3) && str.charAt(0) != str.charAt(1)) {
				 msg = "Yes";
			 }
		 }
		 else if (str.charAt(0) == str.charAt(3)) {
			 if (str.charAt(1) == str.charAt(2) && str.charAt(0) != str.charAt(1)) {
				 msg = "Yes";
			 }
		 }
		 
		 System.out.println(msg);
		 
		 scan.close();

	}

}
