import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qty = sc.nextInt();

		int price[] = new int[qty];
		int maxPrice = 0;
		int maxindex = 0;
		int sum = 0;
		for(int i = 0; i < qty; i ++) {
			price[i] = sc.nextInt();
			if(price[i] > maxPrice) {
				maxPrice = price[i];
				maxindex = i;
			}
			sum += price[i];
		}
		sum -= price[maxindex] / 2;

		System.out.println(sum);
	}
}