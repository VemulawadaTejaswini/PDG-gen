import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		boolean[] flags = new boolean[64];
		Arrays.fill(flags, false);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
			switch (sc.nextInt()) {
				case 0:
					int index = sc.nextInt();
					if (flags[index]) {
						sb.append(1);
					} else {
						sb.append(0);
					}
					sb.append('\n');
					break;
				case 1:
					index = sc.nextInt();
					flags[index] = true;
					break;
				case 2:
					index = sc.nextInt();
					flags[index] = false;
					break;
				case 3:
					index = sc.nextInt();
					flags[index] = !flags[index];
					break;
				case 4:
					boolean flag = true;
					for (boolean tmp : flags) {
						if (!tmp) {
							flag = false;
							break;
						}
					}
					if (flag) {
						sb.append(1);
					} else {
						sb.append(0);
					}
					sb.append('\n');
					break;
				case 5:
					flag = false;
					for (boolean tmp : flags) {
						if (tmp) {
							flag = true;
							break;
						}
					}
					if (flag) {
						sb.append(1);
					} else {
						sb.append(0);
					}
					sb.append('\n');
					break;
				case 6:
					flag = true;
					for (boolean tmp : flags) {
						if (tmp) {
							flag = false;
							break;
						}
					}
					if (flag) {
						sb.append(1);
					} else {
						sb.append(0);
					}
					sb.append('\n');
					break;
				case 7:
					int count = 0;
					for (boolean tmp : flags) {
						if (tmp) {
							++count;
						}
					}
					sb.append(count);
					sb.append('\n');
					break;
				case 8:
					BigDecimal bd = BigDecimal.valueOf(0L);
					BigDecimal bd2 = BigDecimal.valueOf(1L);
					long tmp = 1L;
					for (int j = 0; j < 64; j++) {
						if (flags[j]) {
							bd = bd.add(bd2);
						}
						bd2 = bd2.multiply(BigDecimal.valueOf(2L));
					}
					sb.append(bd.toPlainString());
					sb.append('\n');
					break;
			}
		}
		System.out.print(sb.toString());
	}
}

