import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		int sum = 0;
		for(int i=0; i<N; i++) {
			int x = in.nextInt();
			int d = Math.abs(x-K);
			if(Math.abs(x) < d) {
				sum += 2*x;
			}else {
				sum += 2*d;
			}
		}
		System.out.println(sum);
		
		
		in.close();
	}
}
