import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String reg1 = "RRR";
		String reg2 = "RR";
		String reg3 = "R";
		Pattern p1 = Pattern.compile(reg1);
		Pattern p2 = Pattern.compile(reg2);
		Pattern p3 = Pattern.compile(reg3);
		Matcher m1 = p1.matcher(s);	
		Matcher m2 = p2.matcher(s);	
		Matcher m3 = p3.matcher(s);	

		if(m1.find()) {
			System.out.println("3");
		}else if(m2.find()) {
			System.out.println("2");
		}else if(m3.find()) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}

}