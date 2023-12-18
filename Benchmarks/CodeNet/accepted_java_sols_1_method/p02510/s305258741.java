import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	private static final Scanner S=new Scanner(System.in).useDelimiter("\\s*,\\s*|\\s+");
	private static final PrintStream O=System.out;
	
	public static void main(String[] args) {
		String str;
		int m,h;
		
		while(!(str=S.next()).equals("-")) {
			m=S.nextInt();
			for(int i=0;i<m;i++) {
				h=S.nextInt();
				str=str.substring(h)+str.substring(0, h);
			}
			O.println(str);
		}
	}
}