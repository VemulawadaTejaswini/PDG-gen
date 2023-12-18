import java.util.*;
import java.math.*;

public class Main {
    public static void main (String [] args) {
	Scanner in = new Scanner(System.in);

	while (true) {
	    int n = in.nextInt();
       
	    if (n == 0) {
		break;
	    }

	    double ave = 0.0;
	    double [] s = new double [n];
	    for (int i = 0 ; i < n ; i++) {
		s[i] = in.nextInt();
		ave += s[i];
	    } 

	    ave /= n;

	    double ans = 0.0;
	    for (int i = 0 ; i < n ; i++) {
		ans += Math.pow(s[i]-ave,2.0);
	    }

	    ans /= n;
	    System.out.printf("%.8f\n" ,Math.sqrt(ans));
	}
    }
}