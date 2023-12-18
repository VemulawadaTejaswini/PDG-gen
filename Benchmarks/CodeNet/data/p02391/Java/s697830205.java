public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String comparison = " == ";

		if (a > b) {
			comparison = " > ";
		}	
		if (a < b) {
			comparison = " < ";
		}

		System.out.println(a + comparison + b);
	}
}