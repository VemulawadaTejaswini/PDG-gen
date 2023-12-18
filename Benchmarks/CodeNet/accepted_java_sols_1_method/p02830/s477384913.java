import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String[] s = sc.next().split("");
		String[] t = sc.next().split("");
		
		StringBuilder sb = new StringBuilder();
		for(int i= 0; i < count;i++) {
			sb.append(s[i]);
			sb.append(t[i]);
		}
		System.out.println(sb);
	}

}