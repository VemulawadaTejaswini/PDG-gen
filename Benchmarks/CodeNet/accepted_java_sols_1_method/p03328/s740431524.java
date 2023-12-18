import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
                int sa = b - a;
                int takasa = 0;
                for(int i=1; i<=sa; i++){
                  takasa += i ;
                }
		// 出力
		System.out.println( takasa - b );
	}
}