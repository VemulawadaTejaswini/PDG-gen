import java.util.Scanner;

public class Main {
	private static Scanner sc;
	private static int n;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		n=sc.nextInt();
		PrimeFactorize(n);
	}
	static void PrimeFactorize(int x){
		System.out.print(x+":");
		for(int i=2;i<=Math.sqrt(x);i++){
			int tmp=x;
			if(isPrime(i)){
				while(tmp%i==0){
					System.out.print(" "+i);
					tmp=tmp/i;
				}
			}
		}
		System.out.println();
	}
	static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n)+1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}