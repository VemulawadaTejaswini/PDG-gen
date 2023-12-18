import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int h = sc.nextInt();
		
      	int n = a/h;
        if(a%h!=0){
          n=n+1;
        }
		// 出力
		System.out.println(n);
	}
}