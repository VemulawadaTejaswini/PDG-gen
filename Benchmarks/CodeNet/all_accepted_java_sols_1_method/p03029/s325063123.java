import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int P = sc.nextInt();
		int pie = 0;
		
		A = 3 * A;
		P = P + A;
		pie = P / 2;
		
		System.out.println(pie);
	}
}