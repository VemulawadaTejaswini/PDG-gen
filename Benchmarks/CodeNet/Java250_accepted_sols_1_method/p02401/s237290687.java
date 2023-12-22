public class Main {


		public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int a, b;
		String op;

		
		
		do{
			a = scan.nextInt();
			op = scan.next();
			b = scan.nextInt();
		if(0<=a && a <= 20000 && 0<=b && b <= 20000){
			if( op.equals("+")){
				System.out.println(a+b);
			}else if( op.equals("-")){
				System.out.println(a-b);
			}else if(op.equals("*")){
				System.out.println(a*b);
			}else if(op.equals("/") && b != 0){
				System.out.println(a/b);
			}else if(op.equals("?")){
				break;
			}
		}
		
		}while(true);
		
		}
		



		}