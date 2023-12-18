import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0 , count = 0;
		double ave = 0;
		while ( sc.hasNext() ) {
			String[] line = sc.next().split(",");
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			sum += a * b;
			ave += b;
			count++;
		}
		System.out.println(sum+"\n"+(int)Math.floor(0.5+ave/(double)count));
	}
}