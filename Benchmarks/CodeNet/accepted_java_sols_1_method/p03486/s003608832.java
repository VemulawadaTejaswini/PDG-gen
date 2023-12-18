import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next(),t=sc.next();
		char[] c1=s.toCharArray(),c2=t.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		String ss= new String(c1);
		String ts= new String(c2);

		 ts= new StringBuilder(ts).reverse().toString();
		System.out.println(ss.compareTo(ts)<0?"Yes":"No");

	}
}