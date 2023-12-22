import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i=0; i<n; i++) {
			ar[i] = sc.nextInt();
		}
		boolean F = true;
		int j = 0;
		int times = 0;
		while (F==true) {
			F = false;
			for (int i=n-1; i>=j+1; i--) {
				if (ar[i] < ar[i-1]) {
					int temp = ar[i];
					ar[i] = ar[i-1];
					ar[i-1] = temp;
					times++;
					F = true;
				}
				
			}
			j++;
		}
		for (int x=0; x<n; x++) {
			out.print((x==0?"":" ")+ar[x]);
		}
		out.println();
		out.println(times);
	}
}

