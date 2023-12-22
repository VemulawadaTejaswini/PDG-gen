import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		String S = stdin.next();
		String T = stdin.next();
		int sum=0;
		
		for(int i=0;i<3;i++) {
			if((S.substring(i, i+1)).equals(T.substring(i,i+1))) {
				sum+=1;
			}
		}
			
		out.println(sum);
		
		out.flush();
	}

}
