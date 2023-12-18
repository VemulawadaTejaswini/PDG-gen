
public class Main {

	public static void main(String[] args) {
		int k = new java.util.Scanner(System.in).nextInt();
		String s = new java.util.Scanner(System.in).nextLine();
		if ( s.length()<=k ) {
			System.out.println(s);
		} else {
			for ( int i=0 ;i<k-1 ; i++ ) {
				System.out.print(s.charAt(i));
			}
			System.out.println(s.charAt(k-1)+ "..." );
		}
	}

}
