import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] num = new int[30];
		for(char c: s.toCharArray()) {
			num[c-'a']++;
		}
		for(int i : num) {
			if(i > 1) {
				System.out.println("no");
				return;
			}
		}
		System.out.println("yes");
	}
}