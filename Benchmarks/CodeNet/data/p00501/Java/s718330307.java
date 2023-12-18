public class Main {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int n = in.nextInt();
		String name = in.next();
		int cnt = 0; //当てはまる個数
		for (int i=0; i<n; i++) {
			String board = in.next(); //古い看板
			boolean check = false;
			int same1 = 0; // nameと1文字目が同じ添字を格納
			int same2 = 0; //nameと2文字目が同じ添字を格納
			for(int j=0; j<board.length();j++) {
				if (name.charAt(0) == board.charAt(j)) { //1文字目の判定
					same1 = j;
					for(int k=j+1; k<board.length();k++) {
						if (name.charAt(1) == board.charAt(k)) { //2文字目の判定
							same2 = k;
							int diffe = same2 - same1; //文字間隔
							for (int l=2; l<name.length();l++) {
								if (same2 + diffe*(l-1) < board.length()) {
									if (name.charAt(l) == board.charAt(same2 + diffe*(l-1))) { //3文字目以降を判定
										if (l == name.length()-1) { //nameの長さと同じ
											cnt++;
//											System.out.println(i);
											check = true;
											break;
										}
									}
									else break;
								}
								else break;
							}
							if (check == true) break;
						}
						if (check == true) break;
					}
					if (check == true) break;
				}
				if (check == true) break;
			}
		}
		System.out.println(cnt);
	}
}