import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);

		int datasetNum = 2;
		int num = 0;
		int yakusuu = 0;
		int[] primeNum = new int[3];

		for(int i = 0; i < datasetNum; i++) {
			num = stdin.nextInt();

			for(int j = 1; j <=num; j++) {

				for(int k = 1; k <=j; k++) {

					if(j % k == 0)
						yakusuu++;

				}
				if(yakusuu ==2)
					primeNum[i]++;

				yakusuu = 0;
			}

		}
		for(int i = 0; i < datasetNum; i++ ){
		System.out.println(primeNum[i]);
		}
	}

}