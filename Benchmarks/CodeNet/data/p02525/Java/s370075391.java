import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = scan.nextInt();
			if (n == 0) break;
			int[] data;
			int average = 0;
			double bunnsann = 0;
			data = new int[n];
			int i;
			for (i = 0; i < n; i ++) {data[i] = scan.nextInt(); average += data[i];}
			average /= n;
			for (i = 0; i < n; i ++) bunnsann += (double) (data[i] - average) * (data[i] - average) / n;
			System.out.println(Math.sqrt(bunnsann));
		}
	}
}