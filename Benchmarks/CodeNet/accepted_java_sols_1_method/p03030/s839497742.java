import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			int n,a,b,p,p2;
			int index,result;
			String s,s2;
			n = sc.nextInt();
			Map <String,Integer> mapName = new TreeMap<String,Integer> ();
			Map <Integer,Integer> mapScore = new TreeMap<Integer,Integer> ();

			for(index=0;index<n;index++) {
				s = sc.next();
				p = sc.nextInt();
				s2="";
				p2=100-p;
				if(p2==0) s2="0000";
				else if(p2<10) s2="000"+p2;
				else if(p2<100) s2="00"+p2;
				else if(p2<1000) s2="0"+p2;
				mapName.put(s+s2,index);
				mapScore.put(index,p);
				}
			sc.close();


			for(String key:mapName.keySet()) {
				index=mapName.get(key);
				System.out.println(index+1);
				}

			

			// 出力

	}
}