import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		int sum = 0;
		for (int i = 0; i < n.length(); i++) {
			int num = Integer.valueOf(n.substring(i, i + 1));
			sum += num;
		}
		
		String ans = sum % 9 == 0 ? "Yes" : "No";
		System.out.println(ans);
		
		sc.close();
	}

}


