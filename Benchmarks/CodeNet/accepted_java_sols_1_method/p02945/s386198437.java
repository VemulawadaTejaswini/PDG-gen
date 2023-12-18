import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt(),B=sc.nextInt();
		int temp = A+B;
		if(A-B > temp) temp = A-B;
		if(A*B > temp) temp = A*B;
		System.out.println(temp);
	}
}
