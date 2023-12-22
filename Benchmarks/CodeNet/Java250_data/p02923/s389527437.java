import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
 
public class Main {
 
	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long answer,l,index,index2;
		long a,b,n;
		long h,h2;
		Map <Long,Long> mapH = new HashMap<Long,Long>();
		Map <Long,Long> mapA = new TreeMap<Long,Long>(Collections.reverseOrder());

		String s,t;
		
			// 整数の入力
		
		n = sc.nextInt();
		for(index=0;index<n;index++) {
			h=sc.nextLong();
			mapH.put(index, h);
		}
		sc.close();
		
		answer=0;
		Loop1: for(index=0;index<n;index++) {
			//System.out.println("*:"+index);
			l=0;
			if(index>=n) {
				break Loop1;
			}
			Loop2: for(index2=index+1;index2<n;index2++) {
				h=mapH.get(index2-1);
				h2=mapH.get(index2);
				if(h>=h2) {
				}
				else {
					l=index2-index-1;
					//System.out.println("Loop2:"+index+":"+index2);
					if(l>0) {
						mapA.put(l, index);
					}
					break Loop2;
				}
			}
			if(index2==n) {
				l=n-index-1;
				//System.out.println("Loop2E:"+index+":"+index2);
				if(l>0) {
					mapA.put(l, index);
					//System.out.println("mapA:"+l);
				}
				break Loop1;
			}
			index=index2-1;
		}
		if(mapA.size()==0) {
			System.out.println("0");
		}
		else {
			for (Long lindex : mapA.keySet()) {
			System.out.println(lindex);
			break;
			}
			
		}
			// 出力
 
	}
}	
