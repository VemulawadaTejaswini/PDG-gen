class Main{

	public static void main (String[] args) {

		Main main = new Main();

		java.util.Scanner sc = new java.util.Scanner(System.in);

		int N = sc.nextInt();
		char[] list = new char [N];
		String color = sc.next();

		for (int index=0; index<N; index++) {
			list[index] = color.charAt(index);
		}

		int r = 0;

		for (int index=0; index<N; index++) {
			if (list[index]=='R') {
				r++;
			}
		}
		int count = 0;
		for (int index=0; index<r; index++) {
			if (list[index]=='W') {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
