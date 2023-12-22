public class Main {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		//StringBuilder sb = new StringBuilder();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int i = 0;
		for (int j =0;a + j <= b;j++){
			if (c % (a + j) == 0) { i++; }
		}
		System.out.println(i);
	}
}