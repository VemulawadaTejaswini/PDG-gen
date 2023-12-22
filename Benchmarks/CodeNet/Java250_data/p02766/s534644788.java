import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong(), K = sc.nextLong();
		double ch = Math.log(N)/Math.log(K);
		int ans = (int)Math.ceil(ch);
		if(ans == ch) {
			System.out.println(ans+1);
		}else{
			System.out.println(ans);
		}
	}
}