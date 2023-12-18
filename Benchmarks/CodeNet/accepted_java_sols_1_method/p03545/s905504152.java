
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String num = sc.nextLine();
			int[] a = new int[4];
			
			for (int i = 0; i < 4; i++) {
				a[i] = num.charAt(i) - '0';
			}
			
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++){
					for (int k = 0; k < 2; k++) {
						StringBuilder sb = new StringBuilder();
						sb.append(a[0]);
						int tmp = a[0];
						if (i == 0) {
							tmp += a[1];
							sb.append("+");
						} else {
							tmp -= a[1];
							sb.append("-");
						}
						sb.append(a[1]);
						if (j == 0) {
							tmp += a[2];
							sb.append("+");
						} else {
							tmp -= a[2];
							sb.append("-");
						}
						sb.append(a[2]);
						if (k == 0) {
							tmp += a[3];
							sb.append("+");
						} else {
							tmp -= a[3];
							sb.append("-");
						}
						sb.append(a[3]);
						
						if (tmp == 7) {
							sb.append("=7");
							System.out.println(sb.toString());
							return;
						}
 					}
				}
			}
		}
	}
}