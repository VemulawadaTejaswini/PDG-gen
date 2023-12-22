import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] h = new int[n];
	for (int i=0; i<n; i++) h[i] = sc.nextInt();
	int mae = h[0];
	int max = 0;
	int count = 0;
	for (int i=1; i<n; i++) {
	    if (h[i] <= mae) {
		mae = h[i];
		count++;
		if (count > max)
		    max = count;
	    } else {
		mae = h[i];
		count = 0;
	    }
	}
	System.out.print(max);
    }
}
