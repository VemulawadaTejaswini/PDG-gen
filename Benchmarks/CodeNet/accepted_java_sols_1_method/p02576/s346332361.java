import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		int t = sc.nextInt();

		int k = n/x;
		if ( n%x>0 ) k++;

		System.out.println(k*t);
	}
}