import java.util.*;

public class Main {
	
	static final private String DATE_FORMAT = "yyyy/MM/dd";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double result = 0;
		for(int tmp = 0; tmp < n ; tmp++) {
			double x = sc.nextDouble();
			String y = sc.nextLine();
			if(y.equals(" BTC")) {
				result += x*380000;
			}else {
				result += x;
			}
		}
		System.out.println(result);
	}
}