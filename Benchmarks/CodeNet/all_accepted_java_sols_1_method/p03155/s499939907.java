import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),h = sc.nextInt(),w = sc.nextInt();
		int length = n - h + 1;
		int width = n - w + 1;
		System.out.println(length * width);
	}
}