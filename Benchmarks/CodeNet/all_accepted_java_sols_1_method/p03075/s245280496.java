import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			int index;
			int index2;
			int a;
			int b;
			int result;
			Map <Integer,Integer> map= new HashMap<Integer,Integer> ();
			for(index=0;index<5;index++) {
				a = sc.nextInt();
				map.put(index,a);
			}
			int k = sc.nextInt();
			sc.close();
			// 
			result=0;
			for(index=0;index<4;index++) {
				a = map.get(index);
				for(index2=index+1;index2<5;index2++) {
					b = map.get(index2);
					if(b-a>k) {
						result=1;
						break;
					}
				}
			}
			// 出力

			if(result==1) {
				System.out.println(":(");
			}
			else {
				System.out.println("Yay!");
			}
	}
}