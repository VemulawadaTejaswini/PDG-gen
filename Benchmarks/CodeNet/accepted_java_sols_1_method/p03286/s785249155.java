import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		String ans = "";
		while(N != 0) {
			int rem = Math.abs(N % 2);
			if(N > 0) N = -(N / 2);
			else N = (N - 1) / (-2);
			ans = rem + ans;
		}
		System.out.println((ans.isEmpty()) ? 0 : ans);
	}
}