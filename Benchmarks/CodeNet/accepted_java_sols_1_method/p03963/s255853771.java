import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		double num = 0;
		double c =  Math.pow(b-1,a-1);
		num = b * c;
		// 出力
		int k = (int)num;
		System.out.println(k);
    }
}
