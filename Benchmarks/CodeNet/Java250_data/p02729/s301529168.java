import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Nans = combination(N);
        int Mans = combination(M);

		System.out.println(Nans + Mans);
	}
	public static int combination(int num){
        int ans = (num * (num - 1)) / 2;
		return ans;
	}
}