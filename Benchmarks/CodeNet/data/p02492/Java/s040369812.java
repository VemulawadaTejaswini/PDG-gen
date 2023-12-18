import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		while(true){
			int a = n.nextInt();
			String op = n.next();
			if(op.equals("?"))break;
			int b = n.nextInt();
			if(op.equals("+")){
				System.out.println(a+b);
			}else if(op.equals("-")){
				System.out.println(a-b);
			}else if(op.equals("/")){
				System.out.println(a/b);
			}else if(op.equals("*")){
				System.out.println(a*b);
			}
		}
	}
}