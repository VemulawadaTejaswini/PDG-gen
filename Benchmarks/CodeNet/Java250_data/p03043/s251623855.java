import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		double n = Integer.parseInt(sc.next());
		double k = Integer.parseInt(sc.next());

		double sum = 0;

		for (int i = 1; i <= n; i++) {
			if (i >= k) {
				sum += 1.0;
			} else {
				sum += Math.pow(0.5, Math.ceil(log2(k/i)));
			}
		}

		System.out.println(sum / n);

		sc.close();
	}

	public static double log2(double d)
	{
		return Math.log(d) / Math.log(2);
	}
}
