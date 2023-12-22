import java.util.Scanner;
import java.math.BigInteger;

class Main{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		BigInteger n = scanner.nextBigInteger();
		BigInteger k = scanner.nextBigInteger();
		BigInteger reminder = n.mod(k);
		if(reminder.compareTo(k.subtract(reminder)) < 0){
			System.out.println(reminder);
		}
		else{
			System.out.println(k.subtract(reminder));
		}
	}
}