import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int cnt = 0;
		// 整数の入力
		int gohyaku = sc.nextInt();
		// スペース区切りの整数の入力
		int hyaku = sc.nextInt();
		int goju = sc.nextInt();
		// 文字列の入力
		int x = sc.nextInt();
		
        for(int i = 0; i <= gohyaku; i++){
            for(int j = 0; j <= hyaku; j++){
                for(int k = 0; k <= goju; k++){
                    int ans = 500*i + 100*j + 50*k;
                    if(x==ans){
                        cnt++;
                    }
                }
            }
        }
        
        System.out.println(cnt);
	}
}