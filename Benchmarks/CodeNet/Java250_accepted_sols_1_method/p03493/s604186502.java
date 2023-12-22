import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] a = sc.next().split("");
		int i = 0;
		for(String b : a) {
			if(b.equals("1")) {
				i++;
			}
		}
		System.out.println(i);
	}
}