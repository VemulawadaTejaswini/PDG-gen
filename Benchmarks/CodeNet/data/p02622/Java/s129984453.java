import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int ans=0;
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		char[] a = s.toCharArray();
		String t = sc.nextLine();
		char[] b = t.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			if (a == b) {
				ans++;
			}
		}
		System.out.println(ans);
	}

}
