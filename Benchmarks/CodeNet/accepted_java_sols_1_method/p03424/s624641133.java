import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
        String ans = "Three";
        for(int i = 0; i < n; i++) {
          // 文字列の入力
		  if(sc.next().equals("Y")){
            ans = "Four";
            break;
          }
        }
    
		// 出力
		System.out.println(ans);
	}
}