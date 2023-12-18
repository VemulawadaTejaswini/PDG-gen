import java.util.Scanner;
import java.util.Arrays;

public class Main{
	static boolean[] prime = new boolean[1000001];

	public static void main(String[] args) {
		Arrays.fill(prime, true);
		furui();
		Scanner sc = new Scanner(System.in);
		while(true){
			int a = sc.nextInt();
			int d = sc.nextInt();
			int n = sc.nextInt();
			if(a==0&&d==0&&n==0) break;
			int count=0, i=0;
			while(count<n){
				if(prime[a+i*d]) count++;
				i++;
			}
			System.out.println(a+(i-1)*d);
		}
	}

	static void furui(){
		prime[1] = false;
		for(int i=2; i<prime.length; i++){
			if(prime[i]){
				int multiple = i + i;
				while(multiple<prime.length){
					prime[multiple] = false;
					multiple += i;
				}
			}
		}
	}
}