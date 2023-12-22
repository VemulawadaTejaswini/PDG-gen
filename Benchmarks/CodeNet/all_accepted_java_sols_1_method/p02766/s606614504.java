import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double n = scan.nextDouble();
		double k = scan.nextDouble();
		
		double value = Math.log(n) / Math.log(k);
		int ans = (int)value;
		
		System.out.println(ans+1);
	}
}


