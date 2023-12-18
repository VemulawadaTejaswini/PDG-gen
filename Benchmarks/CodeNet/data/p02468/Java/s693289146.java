import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		long result = 1;
		Scanner s = new Scanner(System.in);
		String[] line = s.nextLine().split(" ");
		double m = Double.parseDouble(line[0]);
		double n = Double.parseDouble(line[1]);
		for(int i=0 ; i<n ; i++) {
			result *= m;
		}
		System.out.println(result % 1000000007);
	}

}