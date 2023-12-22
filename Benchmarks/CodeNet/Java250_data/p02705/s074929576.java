import java.util.Scanner;

public class Main {
	static int R;
	static double L;
	public static void main(String args[]){
		Scanner scanner =new Scanner(System.in);
		R=scanner.nextInt();
		L=R*2*Math.PI;
		System.out.println(L);
	}
}
