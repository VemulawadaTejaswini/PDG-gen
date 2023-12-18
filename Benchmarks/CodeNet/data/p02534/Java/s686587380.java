import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String result = "";
		for(int i = 0; i < n; i++) {
			result += "ACL";
		}
		System.out.println(result);
		sc.close();
	}
}