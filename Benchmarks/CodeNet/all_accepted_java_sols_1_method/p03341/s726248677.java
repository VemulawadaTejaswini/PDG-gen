import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		int count=0;
		int E[] =  new int[N];
		int W[] =  new int[N];
		for (int i=0;i<N-1;i++) {
			if (s.charAt(i)=='W') {
				count++;
			}
			E[i+1]=count;
		}
		count =0;
		for (int i=N-1;i>=1;i--) {
			if (s.charAt(i)=='E') {
				count++;
			}
			W[i-1]=count;
		}
		int min = Integer.MAX_VALUE;
		for (int i=0;i<N;i++) {
			if (E[i]+W[i]<min) {
				min = E[i]+W[i];
			}
		}
		System.out.println(min);
	}
}
