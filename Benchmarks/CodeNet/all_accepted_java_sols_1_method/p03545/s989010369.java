import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[] = new int[4];
		String flg[] = new String[3];
		for (int i = 0; i < 4; i++) {
			num[3 - i] = n % 10;
			n /= 10;
		}
//		for(int i=0;i<4;i++) {
//			System.out.println(num[i]);
//		}
		int sum = num[0];
		for (int bit = 0; bit < (1 << 3); bit++) {
			for (int i = 0; i < 3; i++) {
				if ((bit & (1 << i)) != 0) {
					sum += num[i + 1];
					flg[i] = "+";
				} else {
					sum -= num[i + 1];
					flg[i] = "-";
				}
			//	System.out.println(flg[i]+" "+sum);
			}
			if (sum == 7) {
				System.out.println(num[0] + flg[0] + num[1] + flg[1] + num[2] + flg[2] + num[3] + "=7");
				break;
			}else {
				sum=num[0];
			}
		}
	}

}
