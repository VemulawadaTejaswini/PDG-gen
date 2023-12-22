import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		char s[]=new char[S.length()+1];
		char t[]=new char[T.length()];
		boolean flag=true;
        sc.close();
        if(S.length()+1==T.length()) {
        	for(int i=0;i<S.length();i++) {
        		s[i]=S.charAt(i);
        		t[i]=T.charAt(i);
        		if(s[i]!=t[i]) {
        			flag=false;
        			break;
        		}
        	}
        	
        }
        if(flag==true) {
        	 System.out.println("Yes");
        }else if(flag==false) {
        		System.out.println("No");
        }
	}
}
