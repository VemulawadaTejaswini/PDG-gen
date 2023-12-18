import java.util.Scanner;

public class Main {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String n = sc.next();
	    int count = 0;
	    for(int i = 0; i < n.length(); i++) {
	    	if("2".equals(n.substring(i, i+1))) {
	    		count++;
	    	}
	    }
	    System.out.println(count);
	}
}
