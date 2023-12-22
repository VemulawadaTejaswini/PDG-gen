import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class Main {
 
	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
 
	public static void main(String[] args){
		Map <Integer,Integer> mapP = new HashMap<Integer,Integer> ();
 
		Scanner sc = new Scanner(System.in);
			// 整数の入力
			int n,p,p1,p0,p2,result;
			int index;
			
			n = sc.nextInt();
			for(index=0;index<n;index++) {
				p = sc.nextInt();
				mapP.put(index, p);
			}
			sc.close();
			result=0;
			for(index=1;index<n-1;index++) {
				p0 = mapP.get(index-1);
				p1 = mapP.get(index);
				p2 = mapP.get(index+1);
				if((p0-p1)*(p2-p1)<0 ) {
					result=result+1;
				}
			}

			System.out.println(result);
			
 
			// 出力
 
	}
}