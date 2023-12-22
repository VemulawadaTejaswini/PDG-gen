import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long A = scan.nextLong();
		int B =(int)(scan.nextDouble()*100+0.05);

		long ans =(A * B) / 100;
		System.out.println(ans);
		scan.close();
	}

}
