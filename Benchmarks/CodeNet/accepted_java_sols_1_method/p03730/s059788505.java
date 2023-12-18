import java.util.*;
 
public class Main {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		boolean key = false;
		for (int i = 1; i < 10001; i++) {
			if ((A*i-C)%B == 0) {
				key = true;
			}
		}
		System.out.println(key ? "YES" : "NO");
	}
}