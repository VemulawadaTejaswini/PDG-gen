import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		int a=Integer.parseInt(x);



		System.out.println((a/3600)+":"+(a%3600/60)+":"+(a%3600%60));
	}}