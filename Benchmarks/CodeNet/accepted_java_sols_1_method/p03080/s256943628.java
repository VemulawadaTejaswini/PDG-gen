import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String A = sc.next();
		int red = 0;
		for(int i=0;i<N;i++) {
			if(A.charAt(i)=='R') {
				red++;
			}
			else red--;
		}
		if(red > 0) System.out.println("Yes");
		else System.out.println("No");
	}
	
}
