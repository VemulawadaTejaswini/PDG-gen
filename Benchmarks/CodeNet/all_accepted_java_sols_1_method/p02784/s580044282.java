import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		int N = sc.nextInt();
		long A = 0;
		String ans = "No";
		for(int i = 0;i < N;i++){
			A += sc.nextLong();
		}
		if(A >= H){
			ans = "Yes";
		}
		System.out.println(ans);
	}
}