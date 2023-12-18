import java.util.Scanner;

public class Main {

	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			int n1,n2;
			String s,result;
			s = sc.next();
			sc.close();
			
			n1=Integer.parseInt(s.substring(0,2));
			n2=Integer.parseInt(s.substring(2,4));
			if(n1>0 && n1<13) {
				if(n2>0 && n2<13){
					result="AMBIGUOUS";
				}
				else{
					result="MMYY";
				}
			}
			else if(n2>0 && n2<13) {
				result="YYMM";
			}
			else {
				result="NA";
			}

			// 出力
			System.out.println(result);
	}
}