import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		String ans = "No";
		if(N == M){
			ans = "Yes";
		}
		System.out.println(ans);
	}
}