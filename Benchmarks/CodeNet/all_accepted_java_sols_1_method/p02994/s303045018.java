import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class Main {
 
	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
 
	public static void main(String[] args){
		Map <Integer,Integer> mapL = new HashMap<Integer,Integer> ();
 
		Scanner sc = new Scanner(System.in);
			// 整数の入力
			int sum,sum2,n,l,s,index;
			int result;
			n = sc.nextInt();
			l = sc.nextInt();
			sc.close();
			result=0;
			if(l>=0) {
				result=0;
			}
			else if(l<0 && -l<n) {
				result=-l;
			}
			else if(l<0) {
				result=n-1;
			}
			sum=(l*2+n-1)*n/2-l-result;
			System.out.println(sum);
			
 
			// 出力
 
	}
}