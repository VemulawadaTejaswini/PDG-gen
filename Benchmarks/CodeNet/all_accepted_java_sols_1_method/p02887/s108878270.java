import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();

		int ans = 1;
		String temp = s.substring(0,1);
		for(int i = 1; i < n; i ++) {
			if(s.substring(i, i + 1).equals(temp))
				continue;
			ans++;
			temp = s.substring(i, i + 1);
		}
		System.out.println(ans);
	}
}
