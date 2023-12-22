import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		while(true){
			int a = s.nextInt();
			char op = s.next().charAt(0);
			int b = s.nextInt();
			if(op=='+'){
				System.out.println(a+b);
			}
			else if(op=='-'){
				System.out.println(a-b);
			}
			else if(op=='*'){
				System.out.println(a*b);
			}
			else if(op=='/'){
				System.out.println(a/b);
			}
			else if(op=='?'){
				break;
			}
		}
	}
}