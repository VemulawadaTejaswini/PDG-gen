import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int[] A = new int[M];
		int check = N;
		for(int i = 0; i < M; i++) {
			A[i] = Integer.parseInt(sc.next());
			check -= A[i];
		}
		sc.close();
		
		if(check > 0) {
			System.out.println(check);
		}else if(check == 0) {
			System.out.println(0);
		}else {
			System.out.println(-1);
		}
	}

}