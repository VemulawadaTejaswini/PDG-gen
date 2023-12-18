import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String s[] = new String[1000];
		String c[] = new String[1000];
		int k=0;
		for( int i=0; i< s.length;i++) {
			s[i] = in.next();
			if(s[i].equals("push")) {
				c[k] = in.next(); 
				k++;
			}
			if(s[i].equals("pop")) {
				k--;
				System.out.println(c[k]);
				
			}
			if(s[i].equals("quit")) break; 
		}
		
	}
}