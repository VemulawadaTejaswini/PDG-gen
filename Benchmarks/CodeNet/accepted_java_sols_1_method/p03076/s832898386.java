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
			int r;
			int r0;
			int result;
			result=0;
			r0=10;
			Map <Integer,Integer> map= new HashMap<Integer,Integer> ();
			for(index=0;index<5;index++) {
				a = sc.nextInt();
				map.put(index,a);
				r = a%10;
				if(r==0) {
					r=10;
				}
				b=a+10-r;;
				result=result+b;
				if(r<r0) {
					r0=r;
				}
			}
			sc.close();
			// 
			if(r0<10) {
				result=result+r0-10;
			}
			else {
			}
			// 出力

			System.out.println(result);
	}
}