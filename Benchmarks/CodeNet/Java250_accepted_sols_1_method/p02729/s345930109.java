import java.util.*;

 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int R;
		if(n == 0) {
			R = m*(m-1)/2;
		}
		else if(m == 0) {
			R = n*(n-1)/2;
		}
		else {
			
			R = m*(m-1)/2+n*(n-1)/2;
		}
		System.out.println(R);
	}
}