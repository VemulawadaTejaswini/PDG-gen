import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		do{
			int a = scan.nextInt();
			String op = scan.next();
			int b = scan.nextInt();
				if("?".equals(op)){break;}
				
				else if("+".equals(op)){
					System.out.println(a + b);
				}
				else if("-".equals(op)){
					System.out.println(a - b);
				}
				else if("*".equals(op)){
					System.out.println(a * b);
				}
				else if("/".equals(op)){
					System.out.println(a / b);
				}
		}while(true);
	}
}