import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	String s = sc.next();
	String zero = "0";
	String one = "1";
//	String backspace = " ";
	String[] splitS = s.split("");
	String ans = "";


	for(int i = 0;i < s.length();i++) {
		if(zero.equals(splitS[i])) {
			ans += zero;
		}else if(one.equals(splitS[i])) {
			ans += one;
		}else if("B".equals(splitS[i])){
			if(ans.length() > 0) {
			ans = ans.substring(0,ans.length()-1);
			}
		}
	}
	System.out.println(ans);

	}



}
