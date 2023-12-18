import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextFloat();
		double b = sc.nextFloat();
		double h = sc.nextFloat();
		double m = sc.nextFloat();

		double tanshin = h *5 + (m/12);
		double kakudo = 0;
		if(m > tanshin) {
			kakudo = (m-tanshin) *6;
		}else {
			kakudo = (tanshin -m) *6;
		}
		if(kakudo == 0) {
			System.out.println(Math.abs(a-b));
			return;
		}
		if(kakudo >180) {
			kakudo = 360 - kakudo;
		}
		double answer = Math.sqrt((a* a) + (b* b) -2* a*b * Math.cos(Math.toRadians(kakudo)));
		System.out.println(answer);


	}
}