	import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
 
public class Main {
 
	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
 
	public static void main(String[] args){
		Map <Integer,Integer> mapD = new TreeMap<Integer,Integer> ();
 
		Scanner sc = new Scanner(System.in);
			// 整数の入力
			int n,a,b;
			
			n = sc.nextInt();
			a = sc.nextInt();
			b = sc.nextInt();
			sc.close();
			if(n*a>b) {
				System.out.println(b);
			}
			else {
				System.out.println(n*a);
			}

			
 
			// 出力
 
	}
}