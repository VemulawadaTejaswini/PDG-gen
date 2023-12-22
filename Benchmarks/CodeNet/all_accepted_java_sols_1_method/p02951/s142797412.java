import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

      int ans = c-(a-b);
      if(ans<0) {
        System.out.println(0);
      }else {
        System.out.println(ans);
      }
	}
}
