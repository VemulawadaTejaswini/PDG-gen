
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int yy = n/100;
		int mm = n%100;
		boolean m = false;
		boolean y = false;
		String ans = "NA";
		if(mm > 0 && mm <= 12) {
			m = true;
		}
		if(yy > 0 && yy <= 12) {
			y = true;
		}
		if(m && y) {
			ans = "AMBIGUOUS\r\n" + 
					"";
		}else if(m) {
			ans = "YYMM";
		}else if(y) {
			ans = "MMYY";
		}
		System.out.println(ans);
		sc.close();
	}
}
