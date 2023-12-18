import java.util.*;

public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int K = sc.nextInt();
	int[] a = new int[N+1];
	long tenI = 1;
	for (int i=1; i<=N; i++) {
	    a[i] = sc.nextInt();
	    if (i<=K) tenI *= a[i];
	}
	long tenI1 = 1;
	for (int i=K+1; i<=N; i++) {
	    tenI1 = tenI/a[i-K] * a[i];
	    if (tenI1 > tenI) System.out.println("Yes");
	    else { System.out.println("No"); }
	    tenI = tenI;
	}
    }
}
