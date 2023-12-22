import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	String x = sc.next();
        if (x.length() == 6 && (x.charAt(2) == x.charAt(3)) && (x.charAt(4) == x.charAt(5))) {
 			System.out.println("Yes");
        } else System.out.println("No");
    }
 }