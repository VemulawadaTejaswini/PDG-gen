import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
	    int count = 0;
	    StringBuilder sb1 = new StringBuilder();
	    StringBuilder sb2 = new StringBuilder();
	    for (char a : input.toCharArray()) {
	    	sb1.append(a);
	    	if (sb1.toString().equals(sb2.toString())) {
	    		continue;
	    	}
	    	sb2 = sb1;
	    	sb1 = new StringBuilder();
	    	count++;
	    }
	    System.out.println(count);
	}
}
