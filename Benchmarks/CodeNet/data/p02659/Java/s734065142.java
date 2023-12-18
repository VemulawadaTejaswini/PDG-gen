import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long a = Long.parseLong(scan.next());
		double b = Double.parseDouble(scan.next());
		int tmp = (int)(b*100);
		long ans = a*tmp/100;
		System.out.print(ans);
	}
}