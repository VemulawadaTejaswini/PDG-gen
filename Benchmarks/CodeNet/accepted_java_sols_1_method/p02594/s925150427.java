class Main{

	public static void main (String[] args) {

		Main main = new Main();

		java.util.Scanner sc = new java.util.Scanner(System.in);

		int temp = sc.nextInt();

		if (temp>=30) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();;

	}

}
