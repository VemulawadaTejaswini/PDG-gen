import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		String s = scan.next();
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		String aS = sb.substring(0, a);
		char haihun = sb.charAt(a);
		String bS = sb.substring(a+1, s.length());

		//System.out.println(aS);
		//System.out.println(haihun);
		//System.out.println(bS);
		boolean hantei = true;
		if(aS.matches("[0-9]*")) {
			hantei =true;
		}else {
			hantei = false;
		}

		if(hantei ==true && haihun == '-') {
			hantei  = true;
		}else {
			hantei = false;
			//System.out.println(hantei);
		}

		if(hantei == true && bS.matches("[0-9]*")) {
			hantei  = true;
		}else {
			hantei = false;
		}

		if(hantei == true) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
