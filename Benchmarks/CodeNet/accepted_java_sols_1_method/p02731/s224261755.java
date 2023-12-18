import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double L = sc.nextDouble();
        double tmp = L / 3;
        double ans = tmp * tmp * tmp;
		System.out.println(ans);
	}
}