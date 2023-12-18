import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        int sei  = sc.nextInt();
		        double syou = sc.nextDouble();


		        double total = sei * syou;
		        total = Math.floor(total);
		        long Total = (long)Math.floor(total);
		        System.out.println(Total);
	}
}
