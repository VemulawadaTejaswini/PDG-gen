public class Main {

	public static void main(String[] args) {
		String str = new java.util.Scanner(System.in).nextLine();
		String[] array = str.split(" ");
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);

		int menseki = a * b;
		int shuu = 2*a + 2*b;
		System.out.println(menseki + " " + shuu);

	}
}