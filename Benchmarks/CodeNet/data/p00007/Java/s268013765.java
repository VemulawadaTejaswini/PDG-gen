import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double k = 100000;
		int T = 0;
		for(int a = 0;a < n;a++){
			k = Math.ceil((k*1.05)/1000);
			k = k*1000;
			T = (int)k;
		}
		System.out.println(T);
	}
}