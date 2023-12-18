import java.util.*;


public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
		    int r = sc.nextInt();
		    //符号
		    String n = sc.next();
		    int x = sc.nextInt();
		    if ("+".equals(n)) {
		        System.out.println(r + x);
		    } else if ("-".equals(n)) {
		        System.out.println(r - x);
		    } else if ("*".equals(n)) {
		        System.out.println(r * x);
		    } else if ("/".equals(n)) {
		        System.out.println(r / x);
		    } else {
		        break;
		    }
		    
		}
    }
}
