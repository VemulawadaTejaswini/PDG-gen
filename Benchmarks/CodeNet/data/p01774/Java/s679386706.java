import java.util.Scanner;

public class Main {
	public static String[] segs = {"1110111","0010010","1011101","1011011","0111010","1101011","1101111","1010010","1111111","1111011"};
	public static int[] seg = new int[10];
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			seg[i] = Integer.parseInt(segs[i], 2);
		}

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] broken = new int[14];
		for(int i=0;i<k;i++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			broken[p] |= 1 << (6-q);
		}

		int[] temp = new int[14];
		int[] day = new int[100];
		for(int h=0;h<24;h++) {
			for(int m=0;m<60;m++) {
				for(int s=0;s<60;s++) {
					int count = 0;
					temp[0] = h / 10;
					temp[1] = h % 10;
					temp[2] = m / 10;
					temp[3] = m % 10;
					temp[4] = s / 10;
					temp[5] = s % 10;
					for(int i=0;i<6;i++) {
						count += Integer.bitCount(seg[temp[i]] & ~broken[i+8]);
					}
					day[count]++;
				}
			}
		}

		long ans = 0;
		int y=0,m=1,d=1;
		while(y < 10000) {
			int y_ = y;
			for(int i=0;i<4;i++) {
				temp[3-i] = y_ % 10;
				y_ /= 10;
			}
			temp[4] = m % 10;
			temp[5] = m / 10;
			temp[6] = d % 10;
			temp[7] = d / 10;
			int count = 0;
			for(int i=0;i<8;i++) {
				count += Integer.bitCount(seg[temp[i]] & ~broken[i]);
			}
			ans += n - count >= 0 ? day[n-count] : 0;

			d++;
			if (days[m] + (m == 2 && isLeapYear(y) ? 1 : 0) < d) {
				d = 1;
				m++;
			}
			if (m > 12) {
				m = 1;
				y++;
			}
		}
		System.out.println(ans);
	}

	public static final int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	public static boolean isLeapYear(int y) {
		if (y % 400 == 0) {
			return true;
		}else if(y % 100 == 0) {
			return false;
		}else{
			return y % 4 == 0;
		}
	}

}