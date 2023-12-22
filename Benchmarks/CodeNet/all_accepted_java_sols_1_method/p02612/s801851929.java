import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		int change= (1000-(N%1000));
		if (N%1000==0) {
			System.out.println("0");
		}else {
			System.out.println(change);
		}
	}
}
