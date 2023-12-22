public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		java.util.Scanner sc = new java.util.Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		while (true) {
			int n = sc.nextInt();
			int x = sc.nextInt();

			if ( n==0 && x==0 ) break;

			int count = 0;
			for (int i=1; i <= n-2 && i < x/3; i++) {

				for (int j=i+1; j <= n-1 && j < x/2; j++) {

					for (int k=j+1; k <= n && k < x-2; k++) {
						if ( i+j+k==x ) count++;
					}

				}

			}

			sb.append(count).append("\n");
		}

		System.out.print(sb);
	}

}