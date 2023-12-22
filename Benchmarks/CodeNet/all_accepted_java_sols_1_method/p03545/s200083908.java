import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int i1 = Integer.parseInt(s.substring(0, 1));
		int i2 = Integer.parseInt(s.substring(1, 2));
		int i3 = Integer.parseInt(s.substring(2, 3));
		int i4 = Integer.parseInt(s.substring(3, 4));
		for(int i = 0; i < 2; i++) {
			for(int m = 0; m < 2; m++) {
				for(int j = 0; j < 2; j++) {
					int ans = i1;
					if(i == 0) {
						ans += i2;
					} else {
						ans -= i2;
					}
					if(m == 0) {
						ans += i3;
					} else {
						ans -= i3;
					}
					if(j == 0) {
						ans += i4;
					} else {
						ans -= i4;
					}

					if(ans == 7) {
						StringBuilder sb = new StringBuilder(String.valueOf(i1));
						if(i == 0) {
							sb.append("+");
						} else {
							sb.append("-");
						}
						sb.append(String.valueOf(i2));
						if(m == 0) {
							sb.append("+");
						} else {
							sb.append("-");
						}
						sb.append(String.valueOf(i3));
						if(j == 0) {
							sb.append("+");
						} else {
							sb.append("-");
						}
						sb.append(String.valueOf(i4));
						sb.append("=7");
						System.out.println(sb.toString());
						return;
					}
				}
			}
		}
	}
}