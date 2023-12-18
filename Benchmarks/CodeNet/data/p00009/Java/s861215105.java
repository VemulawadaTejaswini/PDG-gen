import java.util.Scanner;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		for(int j=0;j<30;j++){
			int n = sc.nextInt();
			int cnt = 0;
			if(n>=2)cnt++;
			for(int i=3;i<=n;i+=2){
				if(prime(i)){
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
	static boolean prime(int n){
		boolean isPrime = true;
		for (int i = 2; i <= n - 1; i++){
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}