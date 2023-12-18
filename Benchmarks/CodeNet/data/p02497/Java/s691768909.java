import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			if( m + f + r == -3)break;           // m と f と r の合計が -3 ならループ終了
			if(m == -1 || f == -1){
				System.out.println("F");         // m か f が -1 なら F を出力
			}else if( m + f >= 80){
				System.out.println("A");         // m と f の合計が 80 以上なら A を出力
			}else if( m + f >= 65){
				System.out.println("B");         // m と f の合計が 65 以上なら B を出力
			}else if( m + f >= 50 || r >= 50){
				System.out.println("C");         // m と f の合計が 50 以上 または r が 50 以上なら C を出力
			}else if( m + f >= 30){
				System.out.println("D");         // m と f の合計が 30 以上なら D を出力
			}else{
				System.out.println("F");         // その他は F を出力
			}
		}
	}
}