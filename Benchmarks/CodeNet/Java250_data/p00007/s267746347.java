import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int n = scan.nextInt();
		long mon = 100_000;
		for(int i = 0; i < n; i++){
			mon = (long) Math.ceil(mon * 1.05 / 1000.0) * 1000;
		}
		System.out.printf("%d\n", mon);
	}
}