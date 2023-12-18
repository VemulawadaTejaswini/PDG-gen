import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		if(S.length() == 1) System.out.println(S);
		else {
			long ans = 0;
			for(int i = 0; i < (1 << (S.length() - 1)); i++) {
				// 状態iでのSを計算したいなぁという気持ち
				long eval = 0, tmp = (S.charAt(0) - '0');
				for(int j = 0; j < S.length() - 1; j++) {
					if(((i >> j) & 1) == 1) {
						eval += tmp;
						tmp = (S.charAt(j + 1) - '0');
					}else {
						tmp = tmp * 10 + (S.charAt(j + 1) - '0');
					}
				}
				ans += eval + tmp;
			}
			System.out.println(ans);
		}
	}
}