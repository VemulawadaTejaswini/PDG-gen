import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = 0;
		for(int i = 0; i < N; i++)
			a = a ^ sc.nextInt();
		System.out.println(a == 0 ? "Yes" : "No");

	}

}