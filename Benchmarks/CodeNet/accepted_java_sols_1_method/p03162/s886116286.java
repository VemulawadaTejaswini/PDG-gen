import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] a = new int[N];
	int[] b = new int[N];
	int[] c = new int[N];

	for(int i = 0; i<N; i++) {
	    a[i] = sc.nextInt();
	    b[i] = sc.nextInt();
	    c[i] = sc.nextInt();
	}

	long[][] happy = new long[N][3];
	happy[0][0] = a[0];
	happy[0][1] = b[0];
	happy[0][2] = c[0];
	for(int i = 1; i<N; i++){
	    happy[i][0] = Math.max(happy[i-1][1] + a[i], happy[i-1][2] + a[i]);
	    happy[i][1] = Math.max(happy[i-1][2] + b[i], happy[i-1][0] + b[i]);
	    happy[i][2] = Math.max(happy[i-1][0] + c[i], happy[i-1][1] + c[i]);
	}
	long result = Math.max(happy[N-1][0], happy[N-1][1]);
	result = Math.max(happy[N-1][2],result);
	System.out.println(result);
    }
}