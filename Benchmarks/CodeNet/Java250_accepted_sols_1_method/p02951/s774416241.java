import java.util.*;
public class Main {
		
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		int dif = A - B;
		
		int res = 0;
		
		if(C > dif) {
			res = C - dif;
		}
		else {
			res = 0;
		}
		
		System.out.println(res);
		
	}
	
}