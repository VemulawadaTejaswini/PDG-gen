import java.util.ArrayList;
import java.util.Scanner;


class SaleData {
	private int price;
	private int amount;

	SaleData(int price, int amount){
		this.price = price;
		this.amount = amount;
	}

	public int getPrice() {
		return price;
	}

	public int getAmount() {
		return amount;
	}


}

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		sum_and_average();
	}

	private static void sum_and_average() {
		ArrayList<SaleData> saledatas = new ArrayList<SaleData>();
		int sum = 0;
		double average = 0;

		while (sc.hasNext()) {
			String[] dat = sc.nextLine().split(",");
			saledatas.add( new SaleData(Integer.parseInt(dat[0]),
										Integer.parseInt(dat[1]) ) );
		}

		for (int i = 0; i < saledatas.size(); i++) {
			sum += saledatas.get(i).getAmount() * saledatas.get(i).getPrice();
			average += saledatas.get(i).getAmount();
		}

		System.out.printf("%d\n%d\n",sum, (int)Math.round( average / saledatas.size() ) );

	}

}

