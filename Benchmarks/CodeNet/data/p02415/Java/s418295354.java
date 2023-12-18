import java.util.*;
public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		int n=(int)c;
		if(n>=65 && n<=90) {
			int n2=n+32;
			c=(char)n2;
		}
		else if(n>=97 && n<=122) {
			int n2=n-32;
			c=(char)n2;
		}
		System.out.print(c);
		
	}
}
}

