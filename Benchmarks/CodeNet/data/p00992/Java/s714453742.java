import java.util.*;
import static java.lang.Math.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 1;
		int rap = 0;
		for(int i=1;i<=n;i++) {
			sum += max(sc.nextInt()-rap, 0);
			if(i%4==0) rap++;
		}
		System.out.println(sum);
	}
}