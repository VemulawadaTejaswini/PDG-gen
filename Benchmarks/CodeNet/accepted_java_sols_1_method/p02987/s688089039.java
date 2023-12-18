import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int cnt_1=0;
		char char_1='0';
		int cnt_2=0;
		char char_2='0';
		for (int i=0;i<4;i++) {
			if (i==0) {
				char_1=S.charAt(i);
				cnt_1++;
			} else {
				if (S.charAt(i)==char_1) {
					cnt_1++;
				} else {
					if (char_2=='0') {
						char_2=S.charAt(i);
						cnt_2++;
					} else {
						if (S.charAt(i)!=char_2) {
							break;
						} else {
							cnt_2++;
						}
					}
				}
			}
		}
		if (cnt_1==2 && cnt_2==2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}