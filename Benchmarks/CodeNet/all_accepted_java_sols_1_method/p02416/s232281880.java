public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		java.util.Scanner sc = new java.util.Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		while (true) {

			char[] cdata = sc.nextLine().toCharArray();
			if ( cdata.length==1 && cdata[0]=='0' ) break;

			int sum =0;

			int[] idata = new int[cdata.length];
			for (int i=0; i < cdata.length; i++) {
				idata[i] = Character.getNumericValue( cdata[i] );
				sum += idata[i];
			}

			sb.append(sum + "\n");

		}

		System.out.print(sb);

	}

}