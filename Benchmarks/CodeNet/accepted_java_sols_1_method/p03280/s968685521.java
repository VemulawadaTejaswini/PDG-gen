import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//A
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(A * B - (A + B -1));
	}
}
