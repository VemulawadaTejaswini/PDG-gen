import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans = A - (B + B);
		System.out.println(ans < 0 ? 0 : ans);
	}
}