import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int ans = 0;
			boolean[] prime = new boolean[n];
			int[] inc = new int[n];
			for(int i = 1; i <= n; i++){
				inc[i - 1] = i;
				prime[i - 1] = true;
				if(i == 1)
					prime[i - 1] = false;
				for(int j = 2; j < i; j++){
					if(i % j == 0){
						prime[i - 1] = false;
						break;
					}
				}
			}
			for(int i = 0; i < n; i++){
				if(prime[i] && prime[n - i - 1])
					ans++;
			}
			System.out.println(ans);
		}
	}
	
	public void prime(int n){
		for(int i = 2; i < n; i++){
			if(n % i == 0){
				break;
			}
		}
	}
}