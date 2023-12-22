import java.util.Scanner;
 
public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		long H = Long.parseLong(scan.next());
		long num = at(H, 1);
		long result = (long) Math.pow(2, num) - 1;
		System.out.println(result);
	}
	
	public static long at(long H, long count) {
		if(H == 1) {
			return count;
		}
		return at(H/2, count + 1);
	}
}