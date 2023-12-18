import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int Num = sc.nextInt();
		long arrayLong[] = new long [Num];

		long resultMul = 1;
		long resultMax = (long) Math.pow(10, 18);

		for (int i=0;i<Num;i++) {
			arrayLong[i] = sc.nextLong();
			if(arrayLong[i] == 0) {
				System.out.println(0);
				return;
			}
		}
		sc.close();

		for (int i=0;i<Num;i++) {
			resultMul = resultMul * arrayLong[i];
			if(resultMul > (resultMax)) {
				System.out.println(-1);
				return;
			}
		}

		System.out.println(resultMul);

	}

}