import java.util.Scanner;
class Main{
	int a,b,x;
	String op;
	public void Germany() {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		op = sc.next();
		b = sc.nextInt();
		while(!op.equals("?")) {
			if(op.equals("+")) {
				x = a + b;
				System.out.println(x);
					}else if(op.equals("-")){
				x = a - b;
				System.out.println(x);
					}else if(op.equals("*")){
				x = a * b;
				System.out.println(x);
					}else if(op.equals("/")){
				x = a / b;
				System.out.println(x);
			}
			a = sc.nextInt();
			op = sc.next();
			b = sc.nextInt();
		}
	}
	public static void main(String[] args) {
			new Main().Germany();
	}
}