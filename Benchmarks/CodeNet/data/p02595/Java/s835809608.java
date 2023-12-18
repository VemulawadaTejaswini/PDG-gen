import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		int d = sc.nextInt();
		int cnt = 0;
      for(int i=0; i<n; i++){
        int a = sc.nextInt();
        int b = sc.nextInt();
        if((a*a + b*b) <= d * d){
          cnt++;
        }
      }
      
		System.out.println(cnt);
	}
}