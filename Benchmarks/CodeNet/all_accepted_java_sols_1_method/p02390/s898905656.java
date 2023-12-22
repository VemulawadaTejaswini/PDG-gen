import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.printf("%d:%d:%d\n", a/60/60, a/60%60, a%60);
	}
}