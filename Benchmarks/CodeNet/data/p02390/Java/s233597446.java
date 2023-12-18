import java.util.Scanner;
public class Main{
	//?????°
	static int S,h,m,s;
	//????????????
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		S = sc.nextInt();
		h = S/3600;
		m = (S-(h*3600))/60;
		s = S-((h*3600)+(m*60));
		System.out.println(h+":"+m+":"+s);
	}
	public static void main(String[] args) {
		solve();
	}
}