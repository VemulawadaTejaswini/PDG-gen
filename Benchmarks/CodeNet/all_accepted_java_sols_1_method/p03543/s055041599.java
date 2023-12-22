import java.util.*;
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    String[] ar = str.split("");
        int count = 0;
        String ans = (ar[0].equals(ar[1])&&ar[1].equals(ar[2]) || ar[1].equals(ar[2])&&ar[2].equals(ar[3])? "Yes": "No");
      	System.out.println(ans);
	}
}