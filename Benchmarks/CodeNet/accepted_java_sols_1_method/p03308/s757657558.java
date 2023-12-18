import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int N = in.nextInt();
		int A;
		int min = Integer.MAX_VALUE;
		int max = 0;
		for(int i=0; i<N; i++) {
			A = in.nextInt();
			if(min > A) {
				min = A;
			}
			if(max < A) {
				max = A;
			}
		}
		
		System.out.println(max - min);
		in.close();
		
	}
}