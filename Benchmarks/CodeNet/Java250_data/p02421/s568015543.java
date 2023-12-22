import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int n;
		String tarocard;
		String hanacard;
		int taropoint = 0;
		int hanapoint = 0;
		final int WIN = 3;

		Scanner stdIn = new Scanner(System.in);

		n = stdIn.nextInt();

		for(int i = 0; i < n; i++) {
			tarocard = stdIn.next();
			hanacard = stdIn.next();

			if(tarocard.equals(hanacard)) {
				taropoint++;
				hanapoint++;
			} else if(tarocard.compareTo(hanacard) > 0) {
				taropoint += WIN;
			} else {
				hanapoint += WIN;
			}
		}

		System.out.println(taropoint + " " + hanapoint);

		stdIn.close();
	}
}