import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		String op;
		String jj="+";
		a=sc.nextInt();
		op=sc.next();
		b=sc.nextInt();
		
		if(op.equals(jj)) {
			System.out.println(a+b);
		}else {
			System.out.println(a-b);
			}
	}
}