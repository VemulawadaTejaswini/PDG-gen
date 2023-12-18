import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int N = S.length();
		int flag = 0;
		loop:for (int i=(int)'a';i<(int)'a'+26;i++) {
			char tmp=(char)150;
			for (int j=0;j<N;j++) {
				if (S.charAt(j)==(char)i) {
					if (tmp==(char)150) {
						tmp = T.charAt(j);
					} else {
						if (tmp!=T.charAt(j)) {
							System.out.println("No");
							flag = 1;
							break loop;
						}
					}
				}
			}
			tmp=(char)150;
			for (int j=0;j<N;j++) {
				if (T.charAt(j)==(char)i) {
					if (tmp==(char)150) {
						tmp = S.charAt(j);
					} else {
						if (tmp!=S.charAt(j)) {
							System.out.println("No");
							flag = 1;
							break loop;
						}
					}
				}
			}
		}
		if (flag==0) {
			System.out.println("Yes");
		}
	}
}