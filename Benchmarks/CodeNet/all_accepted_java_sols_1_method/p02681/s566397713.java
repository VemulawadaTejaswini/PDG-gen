import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String S=sc.next();
	String T=sc.next();
	String t=T.substring(0,S.length());
	if(S.equals(t)&&T.length()==(S.length()+1)) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}
	}
}