import java.util.Scanner;
 
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		long ans = 0;
		if (N%(A+B) == 0) {
			ans = A*(N/(A+B));
		} else if (A <= N%(A+B)) {
			ans = A*(N/(A+B)) + A;
		} else {
			ans = A*(N/(A+B)) + N%(A+B);
		}
		System.out.println(ans);
	}
}