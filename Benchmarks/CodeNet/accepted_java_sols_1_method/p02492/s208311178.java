import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a,b,ans=0;
		String op;
		while(true){
			a=sc.nextInt();
			op=sc.next();
			b=sc.nextInt();
			if(op.equals("?")) 
				break;
			else if(op.equals("+")) 
				ans=a+b;
			else if(op.equals("-")) 
				ans=a-b;
			else if(op.equals("*")) 
				ans=a*b;
			else if(op.equals("/")) 
				ans=a/b;
			System.out.println(ans);
		}
	}

}