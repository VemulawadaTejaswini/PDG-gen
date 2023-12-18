import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] line = s.nextLine().split(" ");
		double m = Double.parseDouble(line[0]);
		double n = Double.parseDouble(line[1]);
		int m_n = (int)Math.pow(m, n);
		System.out.println(m_n % 1000000007);
	}

}