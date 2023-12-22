import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long x = scan.nextLong();
		long y = scan.nextLong();
		scan.close();
		long smaller = Math.min(x, y);
		long bigger = Math.max(x, y);
		System.out.println(GreatestCommonDivisor(bigger, smaller));
	}

	static long GreatestCommonDivisor(long x, long y){
		long mod = Math.floorMod(x, y);
		if(mod == 0){
			return y;
		}else{
			x = Math.max(y, mod);
			y = Math.min(y, mod);
			return GreatestCommonDivisor(x, y);
		}
	}
}