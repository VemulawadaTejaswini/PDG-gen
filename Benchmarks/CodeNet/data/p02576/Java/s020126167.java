import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int T = sc.nextInt();
		
		int ans = N / X ;
      if ( N % T != 0 ) ans++;
		System.out.println(ans * T);
	}
}