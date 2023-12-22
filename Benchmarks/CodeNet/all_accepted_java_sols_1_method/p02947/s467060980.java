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
		int a;
		String alpha="abcdefghijklmnopqrstuvwxyz";
		Map <String,Integer> mapA = new TreeMap<String,Integer>();
		Map <String,Integer> mapB = new TreeMap<String,Integer>();
		Map <String,Integer> mapC = new HashMap<String,Integer>();
		
			// 整数の入力
		int n,index,index2,index3,count;
		long answer,count2;
		String s,s2;
		
		n = sc.nextInt();
		for(index=0;index<n;index++) {
			s = sc.next();
			mapA.clear();
			for(index2=0;index2<10;index2++) {
				s2=s.substring(index2,index2+1);
				if(mapA.containsKey(s2)){
					count=mapA.get(s2);
					mapA.put(s2,count+1);
				}
				else {
					mapA.put(s2,1);
				}
			}
			s2="";
			for(String s3:mapA.keySet()) {
				count=mapA.get(s3);
				for(index3=0;index3<count;index3++) {
					s2=s2.concat(s3);
				}
			}
			//System.out.println("/"+s2+"/");
			if(mapB.containsKey(s2)) {
				count=mapB.get(s2);
				mapB.put(s2,count+1);
			}
			else {
				mapB.put(s2,1);
			}
		}
		sc.close();
		
		answer=0;
		for(String s4:mapB.keySet()) {
			count=mapB.get(s4);
			//System.out.print(count);
			if(count>1) {
				count2=count;
				count2=count2*(count2-1)/2;
				if(answer==0) {
					answer=count2;
				}
				else {
					answer=answer+count2;
				}
			}
		}
		System.out.print(answer);

			// 出力
 
	}
}	