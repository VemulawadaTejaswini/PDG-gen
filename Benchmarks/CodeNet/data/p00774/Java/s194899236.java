import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		while(h != 0){
			int[][] s = new int[h + 1][5];
			for(int i = 1; i <= h; i++){
				for(int j = 0; j < 5; j++){
					s[i][j] = sc.nextInt();
				}
			}
			int res = 0;
			boolean flg = true;
			while(flg){
				flg = false;
				for(int i = 1; i <= h; i++){
					for(int j = 0; j < 3; j++){
						int cnt = 1;
						for(int k = j + 1; k < 5; k++){
							if(s[i][j] > 0 && s[i][j] == s[i][k]){
								cnt = cnt + 1;
							}else{
								break;
							}
						}
						if(cnt > 2){
							flg = true;
							res += s[i][j] * cnt;
							for(int k = j; k < j + cnt; k++){
								for(int l = i; l > 0; l--){
									s[l][k] = s[l - 1][k];
								}
							}
							break;
						}
					}
				}
				
			}
			System.out.println(res);
			h = sc.nextInt();
		}
		
		sc.close();
	}
}