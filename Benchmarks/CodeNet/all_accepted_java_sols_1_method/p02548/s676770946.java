import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long ans = 0;
		for(int i = 1;i < n;++i){
			ans += (n-1)/i;
		}
		System.out.print(ans);
	}
}
