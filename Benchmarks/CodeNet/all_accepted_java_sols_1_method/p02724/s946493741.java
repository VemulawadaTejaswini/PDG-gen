// code by Juan Torres
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = x/500;
		int z = (x%500)/5;
		int ans = y*1000 + z*5;
		System.out.println(ans);
		
	}
}
