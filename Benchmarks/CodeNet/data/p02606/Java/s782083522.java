import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int d = sc.nextInt(); 
		int ans = (r-l)/d;
		if(l%d==0 && r%d==0) {
			ans++;
		}
		System.out.println(ans);
		sc.close();
	}
}