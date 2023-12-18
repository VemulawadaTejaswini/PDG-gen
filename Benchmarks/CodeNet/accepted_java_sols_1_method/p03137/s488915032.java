import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();
	int[] x = new int[M];
	for(int i = 0; i<M; i++) {
	    x[i] = sc.nextInt();
	}
	if(N>=M) {
	    System.out.println(0);
	    return;
	}
	Arrays.sort(x);
	int[] offset = new int[M-1];
	for(int i = 0; i<M-1; i++) {
	    offset[i] = x[i+1] - x[i];
	}
	Arrays.sort(offset);
	long ans = 0;
	for(int i = 0; i<(M-1)-(N-1); i++) {
	    ans += offset[i];
	}
	System.out.println(ans);
    }
}