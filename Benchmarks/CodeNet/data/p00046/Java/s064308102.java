import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0046
public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		double[] tmp = new double[100000];
		int cnt = 0;
		while (sc.hasNextDouble()) {
			tmp[cnt++] = sc.nextDouble();
		}
		
		double[] ds = new double[cnt];
		for (int i = 0; i < cnt; i++)
			ds[i] = tmp[i];
		
		sort(ds);
		System.out.println(ds[cnt - 1] - ds[0]);
	}
}