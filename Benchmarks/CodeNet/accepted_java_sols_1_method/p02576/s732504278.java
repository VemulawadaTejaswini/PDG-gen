import java.util.*;
public class Main {
	public static void main(String[] args){
    
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		int x = sc.nextInt();
		int t = sc.nextInt();
		
    
    /*--------------------------------*/
     /*
    //入力
    int n = 20;	//個数
    int x = 12;	//一度に作れるかず
    int t = 6; //一度にかかる時間
    */
		int l = 0;	//現在の個数
    //数列の定義
    int ans = 0;
		while(l<n){
			l += x;	//現在の個数
			ans += t;
		}
		System.out.println(ans);
	}
}

