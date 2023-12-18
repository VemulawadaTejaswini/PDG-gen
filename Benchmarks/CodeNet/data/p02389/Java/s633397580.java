import java.util.Scanner;
public class Main{
	//?????°
	static int a,b;
	//????????????
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a*b + " " +((a*2)+(b*2)));
	}
	public static void main(String[] args) {
		solve();
	}
}