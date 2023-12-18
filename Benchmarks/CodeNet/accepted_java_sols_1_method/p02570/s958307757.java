import java.util.*;

public class Main {

	public static void main(String[] args) {
      Scanner sn = new Scanner(System.in);
    	int e = sn.nextInt();
      int t = sn.nextInt();	
      int v = sn.nextInt();
      double tt = (double)e * 1.0 / v;
      	
      	System.out.println( (tt <= (double)t) ? "Yes":"No");
    }
}