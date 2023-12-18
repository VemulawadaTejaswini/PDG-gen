import java.util.Scanner;

public class Main {
	public static int main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		System.out.println(Math.PI*r*r + " " + Math.PI*r*2);
		return 0;
	}
}