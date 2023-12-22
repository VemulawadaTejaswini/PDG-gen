import java.util.*;


public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String r = sc.next();
		
		if (n >= r.length()) {
		    System.out.println(r);
		} else {
		    String result = r.substring(0, n);
		    System.out.println(result + "...");
		}
		
		
    }
}

