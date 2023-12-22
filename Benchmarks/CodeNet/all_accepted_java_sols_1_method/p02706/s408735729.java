import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();

		sc.nextLine();

		Long sum = (long) 0;
		for(int i=0; i<M; i++) {
			sum += sc.nextLong();
		}

		if(sum <= N) {
			System.out.println(N-sum);
		}else{
			System.out.println("-1");
		}


		sc.close();
	}

}
