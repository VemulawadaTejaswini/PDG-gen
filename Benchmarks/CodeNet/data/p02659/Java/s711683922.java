import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double res = b * a;
		Double newData = new Double(res); 
        long value = newData.longValue(); 
		System.out.println(value);
	}
}