import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
 
public class Main {
 
	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
 
	public static void main(String[] args){
		Map <Long,Long> mapA = new HashMap<Long,Long> ();
		Map <Long,Long> mapB = new TreeMap<Long,Long> ();
 
		Scanner sc = new Scanner(System.in);
			// 整数の入力
			long n,a,a2,b,d,r,m,max,num1,num2,num3,index,index2,time;
			long result1,result2;
			String result;
			
			n = sc.nextLong();
			for(index=0;index<n;index++) {
				a = sc.nextLong();
				b = sc.nextLong();				
				mapA.put(index, a);
				if(mapB.containsKey(b)){
					index2=mapB.get(b);
					a2=mapA.get(index2);
					mapA.put(index2, a+a2);
				}
				else{
					mapB.put(b, index);
				}
			}
			sc.close();
			result="Yes";
			time=0;
			for(long key : mapB.keySet()) {
				index=mapB.get(key);
				a=mapA.get(index);
				time=time+a;
				if(time>key) {
					result="No";
					break;
					}
				}
			
			System.out.println(result);
			
 
			// 出力
 
	}
}