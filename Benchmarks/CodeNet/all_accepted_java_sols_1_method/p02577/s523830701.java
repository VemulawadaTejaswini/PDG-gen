import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String n = sc.nextLine();
	    String[] list = n.split("");
	    int sum = 0;
	    for (int i = 0; i < list.length; i++) {
	    	sum += Integer.parseInt(list[i]);
	    }
	    if (sum % 9 == 0 ) {
	    	System.out.println("Yes");
	    } else {
	    	System.out.println("No");
	    }
	}
}