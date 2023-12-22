import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		double total = 0;
		for(int T = 0; T<N; T++) {
			String S = sc.nextLine();
			String A[] = S.split(" ");
			double price = Double.parseDouble(A[0]);
			
			if(A[1].equals("BTC")) {
				total += price * 380000.0;		
			}
			else {
				total += price;
			}
		}
		
		System.out.println(total);
		
		
	}

}