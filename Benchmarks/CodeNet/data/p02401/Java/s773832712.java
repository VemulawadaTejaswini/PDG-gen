import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		String op;
		do {
		int a=sc.nextInt();
		 op=br.readLine();
		int b=sc.nextInt();
		if(a>=0&&b>=0) {
		if(op.equals("+")) {
			System.out.println(a+b);
		}else if(op.equals("-")) {
			System.out.println(a-b);
		}else if(op.equals("*")) {
			System.out.println(a*b);
		}else if(op.equals("/")){
			System.out.println(a/b);
		}
		}
		}while(!(op.equals("?")));
	}
}


