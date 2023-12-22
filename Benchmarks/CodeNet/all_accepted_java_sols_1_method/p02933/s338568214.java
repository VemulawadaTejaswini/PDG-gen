import java.util.Scanner;

public class Main{
	 public static void main(String[] args) {
		 String result;
	        Scanner scan = new Scanner(System.in);
	        if (scan.nextInt() >= 3200) {
	            result = scan.next();
	        } else {
	            result = "red";
	        }
	        System.out.println(result);
	    }
	}