import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	String str=scan.next();
	String ans="AC";
	if(str.charAt(0)!='A') {
		ans="WA";
	}
	int cc=0;
	for(int i=1;i!=str.length();i++) {
		char ch=str.charAt(i);
		if(Character.isUpperCase(ch)) {
			if(ch!='C') {
			ans="WA";
			}
			if(i==str.length()-1) {
				ans="WA";
			}
			if(i==1) {
				ans="WA";
			}
			cc++;
		}
	}
	System.out.println(cc==1?ans:"WA");
}
}