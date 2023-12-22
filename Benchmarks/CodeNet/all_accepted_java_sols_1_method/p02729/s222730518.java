import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int res = (N*(N-1) + M*(M-1)) >> 1;
		System.out.println(res);
	}
}