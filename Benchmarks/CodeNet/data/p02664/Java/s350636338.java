import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String str = sn.next();
		String[] strArray = str.split("");
		String strPrt = "";
		String befStr = "";
		for(String s : strArray) {
			if(s.equals("P") ||  s.equals("D")) {
				strPrt = strPrt + s;
				befStr = s;
			}else if(befStr.equals("P")) {
				strPrt = strPrt + "D";
				befStr = "D";
			}else {
				strPrt = strPrt + "P";
				befStr = "P";
			}
		}
		System.out.print(strPrt);
	}
}