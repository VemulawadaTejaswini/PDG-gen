import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int D = sc.nextInt();
		int N = sc.nextInt();

		if(N==100) {
			N=N+1;
		}
		
		for(int i=0;i<D;i++) {
			N=N*100;
		}
		
		System.out.println(N);
		
	}
}
