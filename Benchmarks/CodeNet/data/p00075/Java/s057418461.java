import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while( sc.hasNext() ) {
			String[] vals = sc.next().split(",");
			double w = Double.parseDouble( vals[1] ), h = Double.parseDouble(vals[2]);
			if( w / h / h >= 25 ) System.out.println(vals[0]);
		}
	}
}