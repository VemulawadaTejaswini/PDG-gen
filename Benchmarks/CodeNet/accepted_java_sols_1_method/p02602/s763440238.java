import java.util.*;
 
public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int K = sc.nextInt();
	int[] a = new int[N+1];
	for (int i=1; i<=N; i++) {
	    a[i] = sc.nextInt();
	}
	for (int i=K+1; i<=N; i++) {
	    if (a[i] > a[i-K]) System.out.println("Yes");
	    else { System.out.println("No"); }
	}
    }
}
