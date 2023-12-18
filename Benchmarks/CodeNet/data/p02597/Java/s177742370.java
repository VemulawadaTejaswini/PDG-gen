import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int n = sc.nextInt();
			String c = sc.next();

			//			int red = 0;
			//			int white = 0;
			//
			//			for(int i = 0; i < c.length(); i++) {
			//				if(c.charAt(i) == 'R') {
			//					red++;
			//				}else {
			//					white++;
			//				}
			//			}
			//
			//			//全部をどちらかに塗り替える
			//			if(c.charAt(0) == 'R') {
			//				red--;
			//			}
			//			int nurikae = Math.min(red, white);

			int l = 0;
			int r = n - 1;
			int count = 0;
			while (l < r) {
				if (c.charAt(l) == 'R') {
					l++;
				} else {
					if (c.charAt(r) == 'W') {
						r--;
					} else {
						count++;
						l++;
						r--;
					}
				}

			}
			System.out.println(count);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}