public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		java.util.Scanner scan = new java.util.Scanner(System.in);
		java.lang.StringBuilder sb = new java.lang.StringBuilder();

		java.lang.String str = scan.nextLine();
		int q = scan.nextInt();
		scan.nextLine();
		//System.out.println(str);

		for (int i = 0; i < q; i++) {
			String meirei = scan.next();

			if ( "print".equals( meirei ) ) {
				int a = scan.nextInt();
				int b = scan.nextInt();
				System.out.println( str.substring(a, b+1) );
				scan.nextLine();
			} else if ( "reverse".equals( meirei ) ) {
				int a = scan.nextInt();
				int b = scan.nextInt();
				String substr = str.substring(a, b+1);
				java.lang.StringBuilder subsb = new StringBuilder();
				subsb.append(substr).reverse();
				str = str.substring(0, a) + subsb.toString() + str.substring(b+1);
				scan.nextLine();
				//System.out.println(str);
			} else if ( "replace".equals( meirei ) ) {
				int a = scan.nextInt();
				int b = scan.nextInt();
				String p = scan.next();
				str = str.substring(0, a) + p + str.substring(b+1);
				//System.out.println(str);
			}
		}
	}

}