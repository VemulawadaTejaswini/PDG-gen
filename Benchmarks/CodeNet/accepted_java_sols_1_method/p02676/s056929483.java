import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner sc      = new Scanner(System.in);
		 Integer maxLength =  Integer.parseInt(sc.nextLine());
		 String  stringS =  sc.nextLine();

		 if(stringS.length() > maxLength ) {
			 String output = stringS.substring(0, maxLength);
			 System.out.println(output + "...");
		 }else {
			 System.out.println(stringS);
		 }
	}

}