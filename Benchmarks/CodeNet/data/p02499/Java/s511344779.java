public class Main {
	public static void main(String[] args) {
		int[] note = new int['z'+1];
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase();
		for ( int i = 0; i < str.length(); i++ )
			note[str.charAt(i)]++;
		for ( int i = 'a'; i <= 'z'; i++ )
			System.out.println((char)i+" : "+note[i]);
	}
}