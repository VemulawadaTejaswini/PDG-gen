import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int X=scan.nextInt();
		int Y=scan.nextInt();
		int Z=scan.nextInt();
		int a=0;
		a=X;
		X=Y;
		Y=a;
		a=X;
		X=Z;
		Z=a;
		System.out.println(X+" "+Y+" "+Z);

	}

}
