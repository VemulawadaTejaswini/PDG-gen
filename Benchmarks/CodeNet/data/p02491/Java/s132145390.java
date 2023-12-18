import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner n = new Scanner(System.in);
		int a,b;
		a = n.nextInt();
		b = n.nextInt();
		
		System.out.println(a/b + " " + a%b + " " + (double)a/b);
	}
}