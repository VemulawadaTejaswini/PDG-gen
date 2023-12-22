import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		String s=scan.next(),p=scan.next();
		for(int i=0;i<s.length();i++) {
			if(s.indexOf(p)!=-1) {
				System.out.println("Yes");
				return;
			}
			char ch=s.charAt(s.length()-1);
			s=s.substring(0,s.length()-1);
			s=ch+s;
		}
		System.out.println("No");
	}
}
