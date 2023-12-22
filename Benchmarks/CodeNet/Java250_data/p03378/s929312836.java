import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		
		int [] A = new int [M];
		for (int i=0; i<M; i++)
			A[i]=sc.nextInt();
		
		int cur=0;
		while (cur<M && A[cur]<X)
			cur++;
		
		//System.out.println(cur);
		System.out.println(Math.min(cur, M-cur));
		
		
	}

}
