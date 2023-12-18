import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char s[] = str.toCharArray();
		str = sc.nextLine();
		char t[] = str.toCharArray();
		sc.close();
		int n = s.length;
		int ans = 0;
		for (int i=0; i<n; i++) {
			if (s[i]!=t[i]) ans++;
		}
		System.out.println(ans);
	}
}
