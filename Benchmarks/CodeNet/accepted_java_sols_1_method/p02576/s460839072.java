import java.util.*;
public class Main{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int t = sc.nextInt();
		int div = n/x + (n%x == 0 ? 0 : 1);
		System.out.println(div * t);


	}	
}