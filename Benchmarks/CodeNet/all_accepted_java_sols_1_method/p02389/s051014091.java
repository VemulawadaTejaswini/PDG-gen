import java.util.*;

public class Main{
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		int l;
		l = a + a + b + b;
		System.out.println(a * b +" " + l);
	}
}