import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		sc.close();
		long s=100;
		int k=0;
		while(s<X) {
			s+=s/100;
			k++;
		}
		System.out.println(k);
	}

}