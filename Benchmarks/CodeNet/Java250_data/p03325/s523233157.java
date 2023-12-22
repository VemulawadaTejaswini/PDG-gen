import java.util.*;

class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	int[] a = new int[N];
	for (int i = 0; i < N; i++) {
	    a[i] = scan.nextInt();
	}
	int anser = 0;
	for (int i = 0; i < N; i++) {
	    while(a[i] % 2 == 0) {
		a[i] = a[i] / 2;
		anser++;
	    }
	}
	System.out.println(anser);
    }
}
