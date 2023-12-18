import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int K = sc.nextInt();
	int[] A = new int[N+1];
	A[0] = 0;
	for (int i=1;i<=N;i++) {
	    A[i] = sc.nextInt();
	}
	for (int k=0;k<K;k++) {
	    int[] countL = new int[N+1];
	    for (int a=1;a<=N;a++) {
		int str;
		if (a-A[a] < 0) { str = 0;}
		else { str = a-A[a]; }
		int dst;
		if (a+A[a] > N) { dst = N; }
		else {dst = a+A[a]; }
		
		for (int ll=str; ll<=dst; ll++) {
		    countL[ll]++;
		}
	    }
	    for (int aa=1;aa<=N;aa++) {
		A[aa] = countL[aa];
	    }
	}
	StringBuilder sb = new StringBuilder();
	for (int i=1;i<=N;i++) {
	    sb.append(A[i] + " ");
	}
	System.out.print(sb.toString());
    }
}

