public class Main {
	public static void main(String[] args) {
		Scanner in = new java.util.Scanner(System.in);
		int[] s = new int[1];
		
		for(int i = 0 ; i<2 ; i++) {
			s[i] = in.nextInt();
		}
		int a = s[0];
		int b = s[1];
		
		int menseki = a * b;
		int mawari = 2 * (a + b);
		System.out.println(menseki + "と" + mawari);
	}
}