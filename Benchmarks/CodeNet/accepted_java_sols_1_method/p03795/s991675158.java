import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x, y;
		x=n*800;
		y=(n/15)*200;
		System.out.println(x-y);
	}

}