import java.util.Scanner;
class Main{
	public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	String str=scan.next();
	long b=scan.nextLong();
	int count=0;
	for(int i=0;i!=str.length();i++) {
		char ch=str.charAt(i);
		if(ch!='1') {
		break;
		}
		count++;
	}
	if(b<=count) {
		System.out.println(1);
		return;
	}
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch!='1') {
			System.out.println(ch);
			return;
		}
	}
	System.out.println(1);
	}
}