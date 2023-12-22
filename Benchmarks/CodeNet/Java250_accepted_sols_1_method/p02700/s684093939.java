import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hpa = sc.nextInt(), ata = sc.nextInt(), hpb = sc.nextInt(), atb = sc.nextInt();

		while(true) {
			hpb -= ata;
			if(hpb <= 0) {
				System.out.println("Yes");
				break;
			}
			hpa -= atb;
			if(hpa <= 0) {
				System.out.println("No");
				break;
			}
		}
	}
}