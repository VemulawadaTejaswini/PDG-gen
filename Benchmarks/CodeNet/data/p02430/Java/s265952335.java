import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			for (int bit = 1; bit < (1<<n); bit++) {
				if(isTrueNum(bit, k)) {
					System.out.print(bit + ":");
					for (int j = 0; j < n; j++) {
						if (((bit>>j) & 1) == 1) {
							System.out.print(" " + j);
						}
					}
					System.out.println();
				}
			}
		}
	}
	public static boolean isTrueNum(int flags, int num) {
		int cnt = 0;
		for(int j = 0; j < 32; j++) {
			if((flags>>j&1)>0)
				cnt++;
		}
		return num == cnt;
	}
}
