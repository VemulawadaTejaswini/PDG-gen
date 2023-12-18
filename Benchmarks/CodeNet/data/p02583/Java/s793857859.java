import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] L = new int[N];
	for (int i=0; i<N; i++) L[i] = sc.nextInt();
	int count = 0;
	for (int i=0; i<=N-3; i++) {
	    for (int j=i+1; j<=N-2; j++) {
		for (int k=j+1; k<=N-1; k++) {
		    if (L[i]!=L[j] && L[j]!=L[k] && L[i]!=L[k])
			if (L[i]+L[j]>L[k] && L[i]+L[k]>L[j] && L[j]+L[k]>L[i])
			    count++;
		}
	    }
	}
	System.out.print(count);
    }
}
