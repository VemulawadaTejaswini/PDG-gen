import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);



	public static void main(String[] args) {

		while (sc.hasNext()) {

			String str = sc.next();
			String[] st = str.split(",");
			double[] num = new double[st.length];

			for (int i = 0; i < st.length; i++) {
				num[i] = Double.parseDouble(st[i]);
			}

			int a = (int) num[0];
			double b = num[1];
			double c = num[2];

			if (b / (c * c) >= 25) {
				System.out.println(a);
			}

		}

	}

}