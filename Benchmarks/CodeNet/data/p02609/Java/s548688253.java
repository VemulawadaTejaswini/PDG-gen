import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);

		 int n = s.nextInt();
		 String x = s.next();

		 for(int i = 0; i < n; i++) {
			 String before;
			 String target;
			 String after;

			 if(i == 0) {
				 before = "";
			 } else {
				 before = x.substring(0, i);
			 }
			 target  = x.substring(i, i + 1);
			 if("0".equals(target)) {
				 target = "1";
			 } else {
				 target = "0";
			 }
			 if(i == n - 1) {
				 after = "";
			 } else {
				 after = x.substring(i + 1, x.length());
			 }

			 String tmp = new StringBuffer(before).append(target).append(after).toString();
			 int work = Integer.parseInt(tmp, 2);
			if (work == 0 ) {
				System.out.println(0);
			} else {
				System.out.println(func(work, 0));
			}
		 }
	}

	private static int  func(int n, int cnt) {
		int bitCnt = Integer.bitCount(n);

		int tmp = n % bitCnt;

		cnt++;
		if(tmp == 0) {
			return cnt;
		} else {
			return func(tmp, cnt);
		}
	}

}