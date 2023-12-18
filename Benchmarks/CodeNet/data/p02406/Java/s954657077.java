
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int cnt, i, n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		i = n / 10;
		if(n < 10000){
			for(cnt = i; cnt < n; cnt += i){
				System.out.print(cnt + " ");
			}
			if(cnt != n && cnt < n)
				System.out.print(cnt + " " + n);
			else
				System.out.print(n);
		}
	}
}