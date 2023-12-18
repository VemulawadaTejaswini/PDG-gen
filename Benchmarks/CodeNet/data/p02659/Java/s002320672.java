import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        long  sei  = sc.nextLong();
		        double syou = sc.nextDouble();


		        double total = sei * syou;
		        total = Math.floor(total);
		        long Total = (long)Math.floor(total);
		        String anser = String.valueOf(Total);
		        System.out.println(anser);
	}
}
