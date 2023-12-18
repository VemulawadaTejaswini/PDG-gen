import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String result = sc.nextLine();
		 sc.close();
		 if(result.equals("ARC")) {
			 result = "ABC";
		 }
		 else {
			 result = "ARC";
		 }
		 System.out.println(result);
		 
	}
 
}