import java.util.*;
public class Main {

	public static void main(String[] args) {
			Scanner cin = new Scanner(System.in);
			while(true){
				int a,b;
				String op;
				a=cin.nextInt();
				op=cin.next();
				b=cin.nextInt();
				if(op.equals("?")){
				break;
				}
				if(op.equals("+")){
					System.out.println(a+b);
				}else if(op.equals("-")){
					System.out.println(a-b);
				}else if(op.equals("*")){
					System.out.println(a*b);
				}else if(op.equals("/")){
					System.out.println(a/b);
	            }
			}
	}
}	