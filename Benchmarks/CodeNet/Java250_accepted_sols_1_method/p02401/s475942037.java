import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		String op=sc.next();
		int b=sc.nextInt();
		
		while(true){

		int ans=0;
		
		if(op.equals("?")){ 
			break;
		} else if (op.equals("+")){
			ans=a+b;
		} else if (op.equals("-")){
			ans=a-b;
		} else if (op.equals("*")){
			ans=a*b;
		} else if (op.equals("/")){
			ans=a/b;
		}

				System.out.println(ans);
				
				a =sc.nextInt();
				op=sc.next();
				b=sc.nextInt();
		}
	}

}