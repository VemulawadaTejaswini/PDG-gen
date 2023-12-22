import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] line = s.nextLine().split(" ");
		int v1 = Integer.parseInt(line[0]);
		int v2 = Integer.parseInt(line[1]);
		System.out.println(gcd(v1, v2));
	}

	public static int gcd(int v1, int v2) {
		if(v1<v2) {
			int tmp = v1;
			v1 = v2;
			v2 = tmp;
		}

		if(v1%v2 == 0) {
			return v2;
		} else {
			return gcd(v2, v1%v2);
		}
	}

}