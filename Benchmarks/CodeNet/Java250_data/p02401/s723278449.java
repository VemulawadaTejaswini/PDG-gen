import java.util.Scanner;
class Main{
	
	Scanner sc = new Scanner(System.in);
	int a;
	String op;
	int b;
	
	void cp3(){
		while(true){
			a = sc.nextInt();
			op = sc.next();
			b = sc.nextInt();
			if(op.equals("?"))break;
		
		
		
			if ( op.equals("+")){
				System.out.println(a+b);
			} else if ( op.equals ("-")){
				System.out.println(a-b);
			} else if ( op.equals("*")){
				System.out.println(a*b);
			} else if ( op.equals("/")){
				System.out.println(a/b);
			}
		}

	
	}
		
		public static void main(String[]agrs){
			new Main().cp3();
		}
	}