import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int num = Integer.parseInt(a + b);
		String result = "No";
		for(int i = 1; i*i <= num; i++) {
			if(i * i == num) {
				result = "Yes";
			}
		}
		System.out.println(result);
	}
}
