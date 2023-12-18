import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int total = 0;
		for (int i=1; i<N+1;i++) {
			char[] c = Integer.toString(i).toCharArray();
			int sum = 0;
			for (int j=0; j<c.length; j++) {
				sum += Integer.parseInt(String.valueOf(c[j]));
			}
			if (sum >= A && sum<=B ) total += i;
		}
		System.out.println(total);
	}
}
