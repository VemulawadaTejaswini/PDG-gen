import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double L = sc.nextDouble();
		double ans = L*L*L/27;
		System.out.println(String.format("%.12f", ans));
	}
}