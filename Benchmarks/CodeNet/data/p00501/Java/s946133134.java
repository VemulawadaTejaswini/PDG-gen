public class Main {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int n = in.nextInt();
		String name = in.next();
		int cnt = 0; //当てはまる個数
		for (int i=0; i<n; i++) {
			String board = in.next(); //古い看板
			for(int k=0; k<board.length();k++) {
				if (name.charAt(0) == board.charAt(k)) {
					int same1 = k; // nameと1文字目が同じ添字を格納
					int same2 = 0;
					for (int l=k+1; l<board.length(); l++) {
						if (name.charAt(1) == board.charAt(l)) {
							same2 = l; //nameと2文字目が同じ添字を格納
							break;
						}
					}
					int diffe = same2 - same1; //文字間隔
					for (int l=2; l<name.length();l++) {
						if (same2 + diffe*(l-1) < board.length())
							if (name.charAt(l) == board.charAt(same2 + diffe*(l-1))) {
								if (l == name.length()-1)
									cnt++;
							}
						else break;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}