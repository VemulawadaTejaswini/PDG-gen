import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int a,b;
		String op;


		do {
			a=sc.nextInt();
			op=sc.next();
			b=sc.nextInt();

				if(op.equals("+")){System.out.println(a+b);}
				if(op.equals("-")){System.out.println(a-b);}
				if(op.equals("*")){System.out.println(a*b);}
				if(op.equals("/")){System.out.println(a/b);}
		}
		while(!(op.equals("?"))) ;
	}
}

