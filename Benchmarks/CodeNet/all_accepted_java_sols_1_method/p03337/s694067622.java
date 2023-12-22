import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] c = new int[3];
		c[0] = a+b;
		c[1] = a-b;
		c[2] = a*b;
		Arrays.sort(c);
		System.out.println(c[2]);
	}
}