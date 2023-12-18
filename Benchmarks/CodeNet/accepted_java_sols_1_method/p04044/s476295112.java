import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int l = s.nextInt();
		int i = 0;
		String a = "";

		String[] ary = new String[n];

		for(i=0;i<n;i++) {
			ary[i]=s.next();
		}

		Arrays.sort(ary);

		i=0;
		for(i=0;i<n;i++) {
			a=a+ary[i];
		}
		System.out.println(a);

	}

}