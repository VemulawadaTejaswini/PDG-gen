class Main{

	public static void main (String[] args) {

		Main main = new Main();

		java.util.Scanner sc = new java.util.Scanner(System.in);

		int x = sc.nextInt();
		int kyu = 0;

		if (x<600) {
			kyu=8;
		} else if (x<800) {
			kyu=7;
		} else if (x<1000) {
			kyu=6;
		} else if (x<1200) {
			kyu=5;
		} else if (x<1400) {
			kyu=4;
		} else if (x<1600) {
			kyu=3;
		} else if (x<1800) {
			kyu=2;
		} else if (x<2000) {
			kyu=1;
		}

		System.out.println(kyu);

		sc.close();;

	}
}
