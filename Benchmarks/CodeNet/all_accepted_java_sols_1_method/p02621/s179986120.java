import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int a2 =  a*a;
      int a3 =  a*a*a;
      int ans = a+a2+a3;
      System.out.println(ans);
	}
}