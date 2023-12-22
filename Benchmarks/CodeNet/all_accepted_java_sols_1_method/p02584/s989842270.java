import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		BigInteger start = new BigInteger("" + reader.nextLong()), moves = new BigInteger("" + reader.nextLong()), d = new BigInteger("" + reader.nextLong());
		if (start.compareTo(new BigInteger("0")) == 0) {
			if (moves.mod(new BigInteger("2")).compareTo(new BigInteger("0")) == 0) {
				System.out.println(0);
			}
			else {
				System.out.println(d);
			}
		}
		else {
			if (start.abs().compareTo(moves.multiply(d)) >= 0) {
				if (start.compareTo(new BigInteger("0")) < 0) {
					System.out.println(Math.abs(start.add(moves.multiply(d)).longValue()));
				}
				else {
					System.out.println(start.subtract(moves.multiply(d)).longValue());
				}
			}
			else {
				if (start.compareTo(new BigInteger("0")) < 0) {
					long forward = Math.abs(start.divide(d).longValue()) + 1;
					moves = moves.subtract(new BigInteger("" + forward));
					start = start.add(d.multiply(new BigInteger("" + forward)));
				}
				else {
					long forward = start.divide(d).longValue();
					moves = moves.subtract(new BigInteger("" + forward));
					start = start.subtract(d.multiply(new BigInteger("" + forward)));
				}
				if (moves.mod(new BigInteger("2")).longValue() == 0) {
					System.out.println(start.longValue());
				}
				else {
					System.out.println(Math.abs(start.subtract(d).longValue()));
				}	
			}
			reader.close();
		}
	}
	
}
