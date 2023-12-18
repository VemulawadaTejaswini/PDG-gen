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
		int i=2;
		while(x!=1){
			while(x%i==0){
				System.out.print(" "+i);
				x/=i;
			}
			i++;
		}
	}
}