import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        // 整数の入力
		int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        if (a + b == 3)
            ans = 3;
        else if (a + b == 4)
            ans = 2;
        else
            ans = 1;

		System.out.println(ans);
	}
}