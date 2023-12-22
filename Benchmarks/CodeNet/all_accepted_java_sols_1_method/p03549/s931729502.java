import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int count = 1;
		for (int i=0;i<M;i++) {
			count *=2;
		}
		int oneTime = (N-M)*100+1900*M;
		System.out.println(count*oneTime);
	}

}