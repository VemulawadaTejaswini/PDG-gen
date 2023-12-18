import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int n = str.length();

        StringBuffer sb2 = new StringBuffer(str);
		String dst2 = sb2.reverse().toString();
		if (str.compareTo(dst2) != 0) {
			System.out.println("No");
			return;
		}

		String sub1 = str.substring(0,(n-1)/2);
		StringBuffer sb = new StringBuffer(sub1);
		String dst = sb.reverse().toString();
		if (sub1.compareTo(dst) != 0) {
			System.out.println("No");
			return;
		}
		sub1 = str.substring((n+3)/2-1, n);
        sb = new StringBuffer(sub1);
		dst = sb.reverse().toString();
		if (sub1.compareTo(dst) != 0) {
			System.out.println("No");
			return;
		}



		System.out.println("Yes");
	}
}
