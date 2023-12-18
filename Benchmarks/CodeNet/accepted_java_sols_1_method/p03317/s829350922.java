import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int a;
		int ans = 0;

		sc.close();

		if(N==K){
			ans = 1;
		}else{
			ans = (int)(N-1)/(K-1);
			if((N-1)%(K-1)>0)
				ans++;
		}

		System.out.println(ans);
	}
}
