import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int A = Integer.parseInt(stdin.next());
		int B = Integer.parseInt(stdin.next());

		if(B == 1) {
			System.out.println(0);
		}
		else if(A == B) {
			System.out.println(1);
		}
		else {
			int sum=A;
			for(int i=1;i<100;i++) {
				if(i==1) {
					if(A*i >= B) {
						out.println(i);
						break;
					}
				}
				else {
					sum+=A-1;
					if(sum >= B) {
						out.println(i);
						break;
					}
				}
			}
			
		}
		out.flush();
	}

}
