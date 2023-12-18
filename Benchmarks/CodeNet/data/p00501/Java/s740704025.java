import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), space, pos, cnt = 0;
		char[] bar = sc.next().toCharArray();
		for(int i = 0; i < n; i++){
			boolean flg = false;
			char[] board = sc.next().toCharArray();
			for(int j = 0; j < board.length; j++){
				if(bar[0] == board[j]) {
					for(int k = j + 1; k < board.length; k++){
						if(bar[1] == board[k]) {
							space = k - j;
							if( board.length <= space * (bar.length - 1) + j) break; // ??????????????§???????????°
							pos = k;
							for(int l = 2; l < bar.length; l++){
								pos += space;
								if(bar[l] != board[pos]){
									break;
								} else if(l == bar.length - 1) {
									flg = true;
									cnt++;
								}
							}
							if(flg) break;
						}
					}
				}
				if(flg) break;
			}
		}
		System.out.println(cnt);
	}
}