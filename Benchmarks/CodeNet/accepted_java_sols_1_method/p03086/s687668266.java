import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		int cnt=0, ans=0;
		for(char c: s.toCharArray()) {
			if(c=='A' || c=='C' || c=='G' || c=='T')
				cnt++;
			else
				cnt=0;
			ans=Math.max(cnt, ans);
		}
		System.out.println(ans);
	}
}