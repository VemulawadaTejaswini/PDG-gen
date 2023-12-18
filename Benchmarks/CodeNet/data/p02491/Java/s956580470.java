import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner n = new Scanner(System.in);
		int a,b;
		a = n.nextInt();
		b = n.nextInt();
		
		System.out.printf(a/b + " " + a%b + " " +  "%.6f",(double)a/b);
	}
}