import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sa1 = Math.abs(a-b);
		int sa2 = Math.abs(b-c);
		int sa3 = Math.abs(a-c);
		System.out.println(Math.min(sa1+sa2, Math.min( sa1+sa3, sa2+sa3)));
	}
}