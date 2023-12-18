import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			StringBuilder cd = new StringBuilder();
			StringBuilder nCd = new StringBuilder();
			cd.append(sc.next());
			String id = cd.toString();
			if(id.equals("-"))break;
			int m = sc.nextInt();
			for(int i = 0; i < m; i++) {
				int h = sc.nextInt();
				nCd.append(cd.substring(h));
				nCd.append(cd.substring(0, h));
				cd.setLength(0);
				cd.append(nCd);
				if( i == m -1 ) {
					System.out.println(nCd);
				}
				nCd.setLength(0);
			}
		
		}
		sc.close();
	}
	
}
