import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] N = sc.next().toCharArray();
		int sum = 0;
		for(char c : N)
			sum += c - '0';
		System.out.println(sum%9==0 ? "Yes" : "No");

		sc.close();
	}
}
