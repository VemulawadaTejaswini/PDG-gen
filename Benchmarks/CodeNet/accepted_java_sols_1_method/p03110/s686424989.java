import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[] str = new String[n*2];

		int PRICE = 380000;

		for (int i = 0; i < n*2; i++) {
			str[i] = sc.next();
		}
		
		double sum = 0.0;
		for(int i=0;i<n;i++) {
			if("JPY".equals(str[i*2+1])) {
				sum += Integer.parseInt(str[i*2]);
			}else {
				sum += Double.parseDouble(str[i*2]) * PRICE;
			}
		}
		
		sc.close();

		System.out.println(sum);
	}
}
