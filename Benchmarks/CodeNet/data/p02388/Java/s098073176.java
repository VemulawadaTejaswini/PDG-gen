import java.util.Scanner;
public class Main {
	private static void solve(){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(x*x*x);
		sc.close();
	}
	public static void main(String[] args){
		solve();
	}
}