import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int X = sc.nextInt();
		int c = 0;
		int A;
		for(int i=0;i<N;i++) {
			A=sc.nextInt();
			c += 1+(D-1)/A;
		}
		c += X;
		System.out.println(c);
	}

}
