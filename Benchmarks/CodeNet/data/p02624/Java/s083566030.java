import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] f = new int[N+1];
	for (int i=2;i<=N;i++) {
	    for (int j=1;i*j<=N;j++) {
		f[i*j]++;
	    }
	}
	long count = 0;
	for (int i=1;i<=N;i++) {
	    count += (long)i * (long)(f[i]+1);
	}
	System.out.print(count);
    }
}
