import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] d = new int[n];
	for (int i=0; i<n; i++) {
	    d[i] = sc.nextInt();
	}
	Arrays.sort(d);
	int f = d[n/2 - 1];
	int l = d[n/2];
	//f->×,l->〇
	System.out.print(l-f);
    }
}
