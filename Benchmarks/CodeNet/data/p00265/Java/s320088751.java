import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int Q = scan.nextInt();
		int[] c = new int[N];
		for(int i=0;i<c.length;i++)
			c[i] = scan.nextInt();
		for(int i=0;i<Q;i++){
			int r,max = 0,q = scan.nextInt();
			for(int val : c){
				r = val % q;
				max = (r>max)? r : max;
			}
			System.out.println(max);
		}

	}
}