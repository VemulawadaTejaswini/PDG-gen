import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] h = new int[n];
	for (int i=0; i<n; i++) h[i] = sc.nextInt();
	boolean can = true;
	h[0]--;
	for (int i=1; i<n; i++) {
	    if (h[i] < h[i-1]) {
		can = false;
		break;
	    } else if (h[i] == h[i-1]) {
	    } else {
		h[i]--;
	    }
	}
	if (can) System.out.print("Yes");
	else { System.out.print("No"); }
    }
}
