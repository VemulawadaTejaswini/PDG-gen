import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Equals;

class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		String S = scan.next();
		
		if(S.equals("SUN")){
			System.out.println("7");
		}else if(S.equals("MON")){
			System.out.println("6");
		}else if(S.equals("TUE")){
			System.out.println("5");
		}else if(S.equals("WED")){
			System.out.println("4");
		}else if(S.equals("THU")){
			System.out.println("3");
		}else if(S.equals("FRI")){
			System.out.println("2");
		}else if(S.equals("SAT")){
			System.out.println(1);
		}
		

	}

}
