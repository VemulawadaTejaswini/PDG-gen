import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();

		double d = (double)l/3d;
		double v = Math.pow(d,3);

		System.out.println(String.format("%.9f",v));

	}
}