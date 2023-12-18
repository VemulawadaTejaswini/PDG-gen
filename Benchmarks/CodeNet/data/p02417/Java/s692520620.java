public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		java.util.Scanner sc = new java.util.Scanner(System.in);

		char[] abc = "abcdefghijklmnopqrstuvwxyz".toCharArray();

		int[] count = new int[abc.length];

		while ( sc.hasNextLine() ) {
			String data = sc.nextLine();

			for (int i=0; i < abc.length; i++) {
				String alfabet_i_th = String.valueOf( abc[i] );

				for (int j=0; j < data.length(); j++) {
					String alfabetInData = data.substring(j, j+1);

					if ( alfabet_i_th.equalsIgnoreCase( alfabetInData ) ) {
						count[i] ++;
					}

				}

			}
		}

		for ( int i=0; i < abc.length; i++) {
			System.out.println( abc[i] + " : " + count[i]);
		}
	}

}