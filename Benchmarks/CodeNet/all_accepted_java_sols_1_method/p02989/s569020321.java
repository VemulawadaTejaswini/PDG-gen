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
			int n,result,d,dnum,sum;
			int index,flag,key0;
			
			n = sc.nextInt();
			for(index=0;index<n;index++) {
				d = sc.nextInt();
				if(mapD.containsKey(d)) {
					dnum=mapD.get(d);
					mapD.put(d,dnum+1);
				}
				else {
					mapD.put(d,1);
				}
			}
			sc.close();
			result=0;
			sum=0;
			flag=0;
			key0=0;
			for(Integer key:mapD.keySet()) {
				dnum=mapD.get(key);
				if(flag==1) {
					result=key-key0;
					break;
				}
				sum=sum+dnum;
				if(sum*2==n ) {
					flag=1; 
				}
				if(sum*2>n ) {
					flag=1; 
					result=0;
					break;
				}
				key0=key;
			}

			System.out.println(result);
			
 
			// 出力
 
	}
}