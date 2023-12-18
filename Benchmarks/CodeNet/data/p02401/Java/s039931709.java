import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			while(true){
				int a = scan.nextInt();
				char op = scan.next().charAt(0);
				int b = scan.nextInt();
				if( op == '?')break;
				switch(op){
				case '+':
					System.out.println(a + b);
					break;
				case '-':
					System.out.println(a - b);
					break;
				case '*':
					System.out.println(a *b);
					break;
				case '/':
					System.out.println(a /b);
					break;
				}
			}
		}finally{
			if(scan != null)scan.close();
		}
	}
}