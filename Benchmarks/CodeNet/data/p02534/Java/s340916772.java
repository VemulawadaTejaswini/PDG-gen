import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int k = sc.nextInt();

	    StringBuffer sb = new StringBuffer();
	    for (int i = 0; i < k; i++) {
	    	sb.append("ACL");
	    }

	    System.out.println(sb.toString());
	}


}