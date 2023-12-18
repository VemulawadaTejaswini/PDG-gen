import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int Num = sc.nextInt();

		long resultMul = 1;
		long resultMax = (long) Math.pow(10, 18);

		for (int i=0;i<Num;i++) {
			resultMul = resultMul * sc.nextLong();
		}

		if(resultMul > (resultMax)) {
			System.out.println(-1);
		}else {
			System.out.println(resultMul);
		}

		sc.close();

	}

}