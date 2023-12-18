import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Simple_Calculator {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		String op;
		int a;
		int b;
		do {
		a=sc.nextInt();
		op=br.readLine();
		b=sc.nextInt();
		if(op.equals("+")) {
			System.out.println(a+b);
		}else if(op.equals("-")) {
			System.out.println(a-b);
		}else if(op.equals("*")) {
			System.out.println(a*b);
		}else if(op.equals("/")){
			System.out.println(a/b);
		}
		}while(!(op.equals("?"))||(a==0)&&(b==0));
	}
}
