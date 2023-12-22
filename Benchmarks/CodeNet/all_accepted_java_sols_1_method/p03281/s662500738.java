import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		//int b = sc.nextInt();
		// 文字列の入力
		//String s = sc.next();
        // 出力
        int yaku_c;
        int ok_c = 0;
        for(int i=1; i<=n; i++){
            yaku_c = 0;
            for(int j=1; j<=i; j++){
                if(i%2==0)break;
                if(i%j==0)yaku_c++;
            }
            if(yaku_c == 8)ok_c++;
            //System.out.println("i="+i+" yaku_c="+yaku_c+"\n\n");
        }

		System.out.println(ok_c);
	}
}