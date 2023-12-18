import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		String s = "abcdefghijklmnopqrstuvwxyz";
		String result = "";
		long ml = 1;
		for(;;) {
			ml *= 26;
			if(ml >= n)
				break;
		}
		for(;;) {
			ml /= 26;
			result += s.charAt((int) (n / ml - 1));
			n -= (n / ml) * ml;
			if(ml == 1)
				break;
		}
		System.out.println(result);
	}
	public static long pow(long ml, long a, long b){
	    if(b == 1)
	      return ml;
	      ml *= a;
	      b--;
			return b == 0 ? ml : pow(ml , a ,b);
		}
}

