import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() + sc.nextInt() - sc.nextInt() - sc.nextInt();
		System.out.println(n == 0 ? "Balanced" : (n > 0 ? "Left" : "Right"));
	}
}