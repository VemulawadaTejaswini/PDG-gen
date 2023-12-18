import java.util.*;

/* No.10024 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float x1 = sc.nextFloat(),
		y1 = sc.nextFloat(),
		x2 = sc.nextFloat(),
		y2 = sc.nextFloat();
		double kyori = Math.sqrt(Math.pow(Math.abs(x1-x2),2)+Math.pow(Math.abs(y1-y2),2));
		System.out.printf("%.8f\n",kyori);
	}
}