import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			int a,b,c;
			a=cin.nextInt();
			b=cin.nextInt();
			c=a+b;
			String d=Integer.toString(c);
			System.out.println(d.length());
		}
	}
}