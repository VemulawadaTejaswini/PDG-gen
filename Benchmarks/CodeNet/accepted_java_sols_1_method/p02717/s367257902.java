import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int X;
		int Y;
		int Z;
		int temp;
		Scanner sc = new Scanner(System.in);
		X = sc.nextInt();
		Y = sc.nextInt();
		Z = sc.nextInt();
		temp = X;
		X = Y;
		Y = temp;
		temp=X;
		X=Z;
		Z=temp;
		System.out.println(X+" "+Y+" "+Z);
		sc.close();
	}
}
