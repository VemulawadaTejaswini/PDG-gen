import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String postalCode = sc.next();
		boolean okFlag = true;
		if ("-".equals(String.valueOf(postalCode.charAt(a)))) {
			for (int i = 0; i < a; i++) {
				String target = String.valueOf(postalCode.charAt(i));
				if ("1".equals(target) ||  "2".equals(target) || "3".equals(target)
						|| "4".equals(target) || "5".equals(target) || "6".equals(target)
						|| "7".equals(target) || "8".equals(target) || "9".equals(target)
						|| "0".equals(target)) {
				} else {
					okFlag = false;
					break;
				}
			}
			for (int i = a + 1; i < a + b + 1 ; i++) {
				String target = String.valueOf(postalCode.charAt(i));
				if ("1".equals(target) ||  "2".equals(target) || "3".equals(target)
						|| "4".equals(target) || "5".equals(target) || "6".equals(target)
						|| "7".equals(target) || "8".equals(target) || "9".equals(target)
						|| "0".equals(target)) {
				} else {
					okFlag = false;
					break;
				}

			}
		} else {
			okFlag = false;
		}
		if (okFlag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}