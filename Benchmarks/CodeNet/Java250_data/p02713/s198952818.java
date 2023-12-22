import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		long answer = 0;
		for(int a = 1;a <=k;a++) {
			for(int b = 1;b <=k;b++) {
				int tmp = getMaxKoyakusu(a,b);
				for(int c = 1;c <=k;c++) {
					answer+= getMaxKoyakusu(tmp,c);
				}
			}
		}
		System.out.println(answer);
	}

	private static int getMaxKoyakusu(int a, int b) {
		int base = a;
		if(base > b) {
			base =b;
		}

		for(int i =base;i >=1;i--) {
			if(a % i !=0) {
				continue;
			}
			if(b % i !=0) {
				continue;
			}
			return i;
		}

		return 1;

	}
}