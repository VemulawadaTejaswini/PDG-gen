import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		for (int n = sc.nextInt(); n != 0; n = sc.nextInt()) {
			int r = 0;
			for(int j = 2,i = 1,s = 3;j<n;s += (s < n)?++j:-i++)
				if(s == n) r++;
			System.out.println(r);
		}
	}
}