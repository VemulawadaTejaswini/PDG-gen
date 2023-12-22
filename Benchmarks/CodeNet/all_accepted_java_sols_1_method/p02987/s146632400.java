	import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
 
public class Main {
 
	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
 
	public static void main(String[] args){
		Map <Long,Long> mapX = new HashMap<Long,Long> ();
		Map <Long,Long> mapY = new HashMap<Long,Long> ();
		Map <Long,Long> mapX2 = new TreeMap<Long,Long> ();
		Map <Long,Long> mapY2 = new TreeMap<Long,Long> ();
 
		Scanner sc = new Scanner(System.in);
		String s,s1,s2,result;
		// 整数の入力
			int index1,index2,num;
			s = sc.next();
			sc.close();
			
			result="Yes";
			loop1: for(index1=0;index1<3;index1++) {
				s1=s.substring(index1,index1+1);
				num=0;
				for(index2=0;index2<4;index2++) {
					s2=s.substring(index2,index2+1);
					if(s1.equals(s2)) {
						num=num+1;
						}
					}
				if(num!=2) {
					result="No";
					break loop1;
				}			
			}
			
			System.out.println(result);
			
 
			// 出力
 
	}
}