import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		String str2 = scan.next();
		int cnt = 0;

		for(int i = -1+str1.length();i>=0;i--) {
			if(str1.charAt(i) != str2.charAt(i)) {
				cnt += 1;
			}
		}
		System.out.println(cnt);

		scan.close();
	}
}