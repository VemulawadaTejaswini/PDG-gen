import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
        int ans = 0;
      
        for(int i = 1; i <= n; i++) {
          String[] list = ("" + i).split("");
          int count = 0;
          for(int index = 0; index < list.length; index++) {
            count += Integer.parseInt(list[index]);
          }
          if (a <= count && count <= b) {
            ans += i;
          }
        }
    
		// 出力
		System.out.println(ans);
	}
}