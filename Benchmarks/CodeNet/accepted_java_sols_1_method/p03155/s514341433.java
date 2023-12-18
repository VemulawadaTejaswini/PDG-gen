import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int H=stdIn.nextInt();
		int W=stdIn.nextInt();
		int z=0,y=0;
		z=N-H;
		y=N-W;
		z++;y++;
		System.out.println(z*y);
	}
}