import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		// 整数の入力
        
        int[] num = new int[5];
        
        int ans = 0;

        for(int i = 0;i < 5;i++){
            num[i] = sc.nextInt();
        }
		for(int i = 0;i < 5;i++){
            if(num[i] == 0) ans = i+1;
        }
		// 出力
		System.out.println(ans);

    }
}