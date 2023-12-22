import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long X;
		X = sc.nextLong();
		int i=0;
		long p=100;
			while(p<X) {
				p*=1.01;
				i++;
			}
		System.out.println(i);
	}
}