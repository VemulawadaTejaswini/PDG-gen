import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		String ans = "No";
		if((c - a - b) > 0 && (4 * a * b) < (c - a - b) * (c - a - b)){
			ans = "Yes";
		}
		System.out.println(ans);
	}
}