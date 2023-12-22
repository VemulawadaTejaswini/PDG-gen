public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		boolean[] Scards = new boolean[13];
		boolean[] Hcards = new boolean[13];
		boolean[] Ccards = new boolean[13];
		boolean[] Dcards = new boolean[13];

		for ( int i = 0; i < n; i++) {

			String[] data = sc.nextLine().split(" ");
			int r = Integer.parseInt(data[1]);

			switch (data[0]) {
			case "S":
				Scards[r-1] = true;
				break;
			case "H":
				Hcards[r-1] = true;
				break;
			case "C":
				Ccards[r-1] = true;
				break;
			case "D":
				Dcards[r-1] = true;
				break;
			}

		}

		for (int i = 0; i < 13; i++) {
			if (Scards[i] == false) {
				System.out.println( "S " + (i+1) );
			}
		}

		for (int i = 0; i < 13; i++) {
			if (Hcards[i] == false) {
				System.out.println("H " + (i+1));
			}
		}

		for (int i = 0; i < 13; i++) {
			if (Ccards[i] == false) {
				System.out.println("C " + (i+1));
			}
		}

		for (int i = 0; i < 13; i++) {
			if (Dcards[i] == false) {
				System.out.println("D " + (i+1));
			}
		}
	}

}