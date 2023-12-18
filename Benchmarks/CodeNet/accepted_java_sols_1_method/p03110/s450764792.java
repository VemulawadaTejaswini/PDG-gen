import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double exchangeRate = 380000.0;
		double total = 0.0;
		for(int i = 0; i < N; i++){
			double m = sc.nextDouble();
			String c = sc.next();
			if(c.equals("JPY")){
				total += m;
			}else if(c.equals("BTC")){
				total += (m * exchangeRate);
			}
		}
		System.out.println(total);
	}

}
