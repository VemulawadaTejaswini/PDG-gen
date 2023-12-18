import java.util.*;

public class Main {
	//static char[] bar = new char[26];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] bar = sc.next().toCharArray();
		char[][] board = new char[100][25];
		int space = 1, cnt = 0, pos;
		//String[] board = new String[100];
		for(int i = 0; i < n; i++) board[i] = sc.next().toCharArray();
		for(int i = 0; i < n; i++){
			for(int j = 0;j < (n - bar.length); j++){
				if(bar[0] == board[i][j]) {
					for(int k = j + 1; k < n;k++){
						if(bar[1] == board[i][k]){
							pos = 2;
							for(int l = k + space; l < n; l+= space){
								if(bar[pos] != board[i][l]) break;
								else if (pos == bar.length) cnt++;
								pos++;
							}
						}
						else space++;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}