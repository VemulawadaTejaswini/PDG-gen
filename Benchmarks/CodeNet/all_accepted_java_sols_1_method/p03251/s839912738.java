import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();
	int X = sc.nextInt();
	int Y = sc.nextInt();
	int[] x = new int[N+1];
	int[] y = new int[M+1];
	x[0] = X;
	y[0] = Y;
	for(int i = 1; i<N+1; i++) {
	    x[i] = sc.nextInt();
	}
	for(int i = 1; i<M+1; i++) {
	    y[i] = sc.nextInt();
	}
	Arrays.sort(x);
	Arrays.sort(y);
	if(x[N]<y[0]) {
	    System.out.println("No War");
	}else {
	    System.out.println("War");
	}
    }
}