import java.util.Scanner;
class Main {
	int a,b,i;
	String op;
	public void suzuki(){
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		op = sc.next();
		b = sc.nextInt();
		while(!op.equals("?")){
			if(op.equals("+")){
				i = a + b;
				System.out.println(i);
			}else if(op.equals("-")){
				i = a - b;
				System.out.println(i);
			}else if(op.equals("*")){
				i = a * b;
				System.out.println(i);
			}else if(op.equals("/")){
				i = a / b;
				System.out.println(i);
			}
			a = sc.nextInt();
			op = sc.next();
			b = sc.nextInt();
		}
	}
	public static void main(String[] args){
		new Main().suzuki();
	}
}