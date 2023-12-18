import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int d = sc.nextInt();
			int s = 0;
			for(int i = 1; i * d < 600; i++) {
				s += (i * d) * (i * d) * d;
			}
			System.out.println(s);
		}
		sc.close();
	}
}
