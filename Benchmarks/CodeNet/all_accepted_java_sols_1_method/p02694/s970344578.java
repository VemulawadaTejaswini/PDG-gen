import java.util.*;
import java.util.function.IntConsumer;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
        double balance = 100;
        int i = 0;
        while(balance < X) {
            balance = Math.floor(balance + balance*0.01);
            i++;
        }
		System.out.println(i);
	}
}