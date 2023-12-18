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
			int s,index,i,j,k,l;
			String result;
			s = sc.nextInt();
			sc.close();
			i=s%10;
			result="Good";
			for(index=0;index<3;index++) {
				s=(s-i)/10;
				if(i==s%10) {
					result="Bad";
					break;
				}
				i=s%10;
			}
			System.out.println(result);
			
 
			// 出力
 
	}
}