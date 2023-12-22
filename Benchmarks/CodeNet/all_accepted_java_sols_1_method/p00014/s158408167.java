import java.util.Scanner;

public class Main {
	static Scanner sc = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		while (sc.hasNext()) {
			int d = sc.nextInt();
			int s = 0;
			for(int i=0;i<600/d;i++){
				s=s+d*i*d*i*d;
			}
			System.out.println(s);

		}
	}
}