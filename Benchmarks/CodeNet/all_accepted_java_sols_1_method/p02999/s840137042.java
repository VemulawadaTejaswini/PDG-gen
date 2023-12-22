import java.util.*;
public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
		// 整数の入力
		int X = sc.nextInt();
    int A = sc.nextInt();

    int ans = 0;

    if(X >= A){
      ans = 10;
    }


		System.out.println(ans);
	}
}
