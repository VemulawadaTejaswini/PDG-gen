import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int sum = a1 + b1;
		int count = String.valueOf(sum).length();
		System.out.println(count);
	}

}