import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		int Max = 1000000;
		int num[] = new int[Max];
		int N = 0; // ??°???????????°

		for(int i = 0; i < Max; i++){

			num[i] = sc.nextInt();
			N++;
			if(num[i] == 0){
				break;
			}
		}

		for(int i = 0; i < N; i++){
			if(num[i] == 0){
				break;
			}
			System.out.println(countPrime(num[i]));
		}




	}

	public static int countPrime(int n){
		int count=0;

		for(int i = n+1; i <= 2 * n; i++){
//			System.out.println("test");
			if(primeJudge(i)==true){
				count++;
			}
		}

		return count;
	}


	public static boolean primeJudge(int n){// prime -> true

		if(n < 2){
			return false;
		}

		for(int i = 2; i < n; i++){
			if(n % i == 0 ){
				return false;
			}
		}

		return true;
	}


}