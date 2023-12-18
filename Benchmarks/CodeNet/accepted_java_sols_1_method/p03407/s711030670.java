import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt() + sc.nextInt() - sc.nextInt();
		System.out.println(i  < 0 ? "No" : "Yes");
	}
}