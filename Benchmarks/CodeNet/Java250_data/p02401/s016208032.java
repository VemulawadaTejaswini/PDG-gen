import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a;
		String op;
		int b;
		for(int k =1;k>0;k++){
			a = scan.nextInt();
			op = scan.next();
			b = scan.nextInt();
			if(op.equals("+")){
				System.out.println(a+b);
			}else if(op.equals("-")){
				System.out.println(a-b);
			}else if(op.equals("*")){
				System.out.println(a*b);
			}else if(op.equals("/")){
				System.out.println(a/b);
			}else if(op.equals("?")){
				break;
			}
		}
	}
}