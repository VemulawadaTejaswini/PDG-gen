import java.util.*;
public class Main {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 String s = sc.next();
		 int min = Integer.MAX_VALUE;
		 for (char i = 'a'; i <= 'z'; i++) {
			 int m = 0;
		     String[] ws = s.split("" + i);
		     for (String w : ws) {
		    	 m = Math.max(m, w.length());
		     }
		     min = Math.min(m, min);
		 }
		 System.out.println(min);
	}
}
