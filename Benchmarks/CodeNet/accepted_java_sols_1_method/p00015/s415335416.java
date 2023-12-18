import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i=0;i<n;i++) {
			int [] a = new int[81];
			int [] b = new int[81];
			Arrays.fill(a, 0);
			Arrays.fill(b, 0);
			String [] as = s.next().split("");
			String [] bs = s.next().split("");
			if (as.length > 80 | bs.length > 80) {
				System.out.println("overflow");
				continue;
			}
			for (int j=0;j<as.length;j++) {
				a[j] = Integer.valueOf(as[as.length - 1 - j]);
			}
			for (int j=0;j<bs.length;j++) {
				b[j] = Integer.valueOf(bs[bs.length - 1 - j]);
			}
			int ansLen = 0;
			for (int j=0;j<80;j++) {
				int temp = a[j] + b[j];
				int c = temp / 10;
				int r = temp % 10;
				a[j] = r;
				a[j + 1] += c;
				if (a[j] != 0) ansLen = j;
			}
			if (a[80] != 0) {
				System.out.println("overflow");
				continue;
			}
			String ans = "";
			for (int j=0;j<=ansLen;j++) {
				ans = a[j] + ans;
			}
			System.out.println(ans);
			
		}
	}
}

