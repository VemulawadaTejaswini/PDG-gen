import java.util.Scanner;
 class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,result=0;
		String op;
		for(;;){
			a = sc.nextInt();
			b = sc.nextInt();
			op =sc.next();
			if(op.equals("?"))break;
			if(op.equals("+")){
				result=a+b;
			}
			else if(op.equals("-")){
				result=a-b;
			}
			else if(op.equals("*")){
				result=a*b;
			}
			else if(op.equals("/")){
				result=a/b;
			}
			System.out.println(result);
		}
	}
 }