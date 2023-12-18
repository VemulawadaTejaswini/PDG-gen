//QÂÌ® a, b ÆPÂÌZq op ðÇÝñÅAa op b ðvZ·évO
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String op = sc.next();
		int b = sc.nextInt();
		while(! op.equals("?")){
			if(op.equals("+")){
				System.out.println(a + b);
			}
			else if(op.equals("-")){
				System.out.println(a -b);
			}
			else if(op.equals("*")){
				System.out.println(a * b);
			}
			else if(op.equals("/")){
				System.out.println(a / b);
			}
			else{System.out.println(op);}
			a = sc.nextInt();
			op = sc.next();
			b = sc.nextInt();
		}

	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}