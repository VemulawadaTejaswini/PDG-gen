import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		for(int i=0;i<q;i++) {
			int c = sc.nextInt();
			int a = sc.nextInt();
			int n = sc.nextInt();
			int max = 0;
			int zmax = Math.min(Math.min(c, a), n);
			for(int z=0;z<=zmax;z++) {
				int xupper = Math.min((c - z) / 2, a - z);
				for(int x=xupper;x>=xupper-2;x--) {
					if (x < 0) {
						break;
					}
					int kupper = (c + 2 * z + x) / 3;
					int klower = (z + x);
					if (klower <= kupper) {
						max = Math.max(max,kupper);
					}
				}
			}
			System.out.println(max);
		}
	}

}