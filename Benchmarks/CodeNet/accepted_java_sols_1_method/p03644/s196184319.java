import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int bn = 1;
		while(bn<=n)bn*=2;
		System.out.println(bn/2);
	}
}