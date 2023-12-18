import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			double val = in.nextDouble();
			if (val < 0) {
				break;
			}
			String ans;
			if (val >= 256) {
				ans = "NA";
			} else {
				int seisu = (int) val;
				int syosu = (int) ((val - seisu) * 16);
				if ((val - seisu) * 16 - syosu != 0) {
					ans = "NA";
				} else {
					String seisuB = Integer.toBinaryString(seisu);
					while (seisuB.length() < 8) {
						seisuB = "0" + seisuB;
					}
					String syosuB = Integer.toBinaryString(syosu);
					while (syosuB.length() < 4) {
						syosuB = "0" + syosuB;
					}
					ans = seisuB + "." + syosuB;
				}
			}
			System.out.println(ans);
		}

	}
}