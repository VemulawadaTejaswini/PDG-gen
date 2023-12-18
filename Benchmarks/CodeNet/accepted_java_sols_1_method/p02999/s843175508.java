import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int X=t.nextInt(), A=t.nextInt();
		if(X<A) {
			System.out.println(0);
		}else {
			System.out.println(10);
		}
	}
}