import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] number = new int[100001];
	long sum =0;
	for (int i=0;i<N;i++) {
	    int A = sc.nextInt();
	    sum += A;
	    number[A]++;
	}
	int Q = sc.nextInt();
	StringBuilder sb = new StringBuilder();
	for (int i=0;i<Q;i++) {
	    int B = sc.nextInt();
	    int C = sc.nextInt();
	    sum = sum - number[B]*(B-C);
	    
	    if (i == Q-1) {
		sb.append(sum);
	    } else {
		sb.append(sum + "\r\n");
	    }
	    number[C] += number[B];
	    number[B] = 0;
	}
	System.out.print(sb.toString());
    }
}
