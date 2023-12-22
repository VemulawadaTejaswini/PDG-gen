	import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class Main {
 
	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Map <Long,Long> mapA = new HashMap<Long,Long> ();
		Map <Long,Long> mapB = new HashMap<Long,Long> ();
			// 整数の入力
		int k,x,start,end,index;

		k = sc.nextInt();
		x = sc.nextInt();
		sc.close();
		
		start=x-k+1;
		end=x+k-1;
		for(index=start;index<end;index++) {
			System.out.print(index);
			System.out.print(" ");
		}
		System.out.print(end);

			// 出力
 
	}
}