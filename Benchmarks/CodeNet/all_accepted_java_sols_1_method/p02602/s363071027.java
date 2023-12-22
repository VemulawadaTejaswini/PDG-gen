class Main{

	public static void main (String[] args) {

		Main main = new Main();

		java.util.Scanner sc = new java.util.Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] list = new int[N];

		for (int index=0; index<N; index++) {
			list[index]=sc.nextInt();
		}

		for (int index=0; index<N-K; index++) {
			if (list[index]<list[K+index]) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

		sc.close();;

	}

}
