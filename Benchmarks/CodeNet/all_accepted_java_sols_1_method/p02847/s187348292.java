	import java.util.Scanner;
 
public class Main {
 
	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n,m,answer,index;
		float ans;
		String s,t;
		
			// 整数の入力
		
		s = sc.next();
		sc.close();
		
		
		if(s.equals("SUN")){
			System.out.print("7");
		}
		else if(s.equals("MON")){
			System.out.print("6");
		}
		else if(s.equals("TUE")){
			System.out.print("5");
		}
		else if(s.equals("WED")){
			System.out.print("4");
		}
		else if(s.equals("THU")){
			System.out.print("3");
		}
		else if(s.equals("FRI")){
			System.out.print("2");
		}
		else if(s.equals("SAT")){
			System.out.print("1");
		}

			// 出力
 
	}
}	