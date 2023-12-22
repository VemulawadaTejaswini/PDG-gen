import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		
		int sqrt = (int)Math.sqrt(X);
		int ans = 1;
		for(int i = 2;i <= sqrt;++i) {
			int num = i * i;
			while(num*i <= X)
				num *= i;
			if(num > ans)
				ans = num;
		}
		System.out.println(ans);
	}
}
