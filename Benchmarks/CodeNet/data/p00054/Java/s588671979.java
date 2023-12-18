import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a,b,n,ans = 0;
			a %= b;
		        for(int i = 0; i < n; i++){
			      a *= 10;
			      ans += a/b;
			      a %= b;
		        }
			System.out.println(ans);
		}
	}
}