import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		TreeSet<Double> mountains = new TreeSet<Double>();
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			mountains.add(Double.valueOf(scan.next()));
		}
		System.out.println(mountains.last() - mountains.first());
		scan.close();
	}

}
