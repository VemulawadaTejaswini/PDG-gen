import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(func(n));
	}
	public static long func(int n){
		long res = 0;
		if(n != 0){
			int ct = 1;
			for(int i = 1; i <= n/2; i++){
				if(n % i == 0){
					ct ++;
				}
			}
			res = n * ct + func(n - 1);
		}
		return res;
	}

}