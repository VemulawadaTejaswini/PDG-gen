class Main{

	public static void main (String[] args) {

		Main main = new Main();

		java.util.Scanner sc = new java.util.Scanner(System.in);

		int N = sc.nextInt();
		int D = sc.nextInt();

		int count = 0;

		for (int index=0; index<N; index++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (Math.pow(x, 2)+Math.pow(y, 2)<=Math.pow(D, 2)) {
				count++;
			}
		}

		System.out.println(count);

		sc.close();;

	}

}
