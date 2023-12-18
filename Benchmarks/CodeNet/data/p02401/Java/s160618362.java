import java.util.*;
public class Main {

	public static void main(String[] args) {
		int i1, i2;
		String op;
		Scanner sc = new Scanner(System.in);
		while(true){
			i1 = sc.nextInt();
			op = sc.next();
			i2 = sc.nextInt();
			if(op.equals("?"))
				break;
			else if(op.equals("+"))
				System.out.println(i1 + i2);
			else if(op.equals("-"))
				System.out.println(i1 - i2);
			else if(op.equals("*"))
				System.out.println(i1 * i2);
			else if(op.equals("/"))
				System.out.println(i1 / i2);
		}
	}

}