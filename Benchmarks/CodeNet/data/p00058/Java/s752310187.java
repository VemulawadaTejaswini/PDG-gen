import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			String[] nico = sc.nextLine().split(" ");
			
			BigDecimal dxab = new BigDecimal(nico[0]).subtract(new BigDecimal(nico[2]));
			BigDecimal dyab = new BigDecimal(nico[1]).subtract(new BigDecimal(nico[3]));
			BigDecimal dxcd = new BigDecimal(nico[4]).subtract(new BigDecimal(nico[6]));
			BigDecimal dycd = new BigDecimal(nico[5]).subtract(new BigDecimal(nico[7]));
			
			if ((dxab.multiply(dxcd).add(dyab.multiply(dycd))).doubleValue() == 0.0) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}