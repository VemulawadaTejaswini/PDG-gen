import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(",|\\r\\n");
		int chohoke = 0;
		int hisi = 0;
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (a*a + b*b == c*c) chohoke++;
			if (a == b) hisi++;
		}
		System.out.println(chohoke);
		System.out.println(hisi);
	}

}