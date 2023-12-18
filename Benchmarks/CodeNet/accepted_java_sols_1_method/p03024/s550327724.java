import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();;
		int cnt = 0;
		String ans = "YES";
		for(int i=0;i<c.length;i++) {
			if(c[i]=='x'){
				cnt++;
			}
			if(cnt>7) {
				ans = "NO";
				break;
			}
		}
		System.out.println(ans);
	}
}