import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double counter = 0;
		for(int i = 0; i < n; i++) {
			double x = sc.nextDouble();
			String u = sc.next();
			if(u.equals("JPY")) {
				counter += x;
			}else if(u.equals("BTC")) {
				counter += 380000*x;
			}
		}System.out.println(counter);
	}

}
