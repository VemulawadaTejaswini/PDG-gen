import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] ar = new int[n];
		boolean F = false;
		for (int i=0; i<n; i++) {
			ar[i] = sc.nextInt();
			if (ar[i]%2==1) {F = true;}
		}
		
		if (F == true) {out.println(0);}
		else {
			int min = Integer.MAX_VALUE;
			for (int i=0; i<n; i++) {
				int times = 0;
				while (ar[i]%2==0) {
					ar[i] /= 2;
					times++;
				}
				min = Math.min(min,times);
			}
			out.println(min);
		}
	}
}