import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double r = Double.parseDouble(sc.next());
		sc.close();
		
		//累乗の計算
		int ans = (int) Math.pow(r,2);
		System.out.println(ans);
	}
}