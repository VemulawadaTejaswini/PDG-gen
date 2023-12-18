import java.util.Scanner;


public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s=scanner.next();
		String ans = "";
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			c-=3;
			if(c<'A'){
				c+=26;
			}
			ans+=c;
		}
		System.out.println(ans);
	}
}