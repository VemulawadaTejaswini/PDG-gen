import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		int bus = stdIn.nextInt();
		int bus_free = stdIn.nextInt();
		int train = stdIn.nextInt();
		int train_free = stdIn.nextInt();
		
		int bus_fee = bus;
		int train_fee = train;
		
		if(bus > bus_free)
		{
			bus_fee = bus_free;
		}
		if(train > train_free)
		{
			train_fee = train_free;
		}
		
		System.out.println(bus_fee + train_fee);

	}

}
