import java.util.*;

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int r = sc.nextInt();
        int D = sc.nextInt();
        int x = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            x = r * x - D;
            System.out.println(x);
        }

    }

}