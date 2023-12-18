
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();

		n=n%26;

		char[] ss=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			ss[i]=s.charAt(i);
			for(int j=0;j<n;j++) {
			    ss[i]++;
			    if(String.valueOf(ss[i]).matches("[^A-Z]")) {
			    	ss[i]='A';
			    }
			}

		}
		for(int i=0;i<s.length();i++) {
			System.out.print(ss[i]);
		}System.out.println();


	}

}
