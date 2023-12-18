import java.util.Scanner;

class Main{


	public static void main(String[] a){

		Scanner sc = new Scanner(System.in);





		while(sc.hasNext()) {
			int count = 0;
			int n = sc.nextInt();

			for(int i = 1; i <= n; i++) {
				if(isPrime(i)) {
					count++;
				}
			}


			System.out.println(count);
		}



	}






	public static boolean isPrime(int n) {

		if(n == 1) {return false;}
		if(n%2 ==0){return false;}

		for(int i = 2; i < n-1; i++) {
			if((n % i) ==0) {
				return false;

			}
		}

		return true;

	}



}