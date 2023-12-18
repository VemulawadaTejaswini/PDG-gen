import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String tap = scan.next();
		int count = 0;

		for(int i=0;i<tap.length();i++) {
			if(i%2==0) {
				String kaku = tap.substring(i, i+1);
				if(kaku.equals("R") || kaku.equals("U") || kaku.equals("D")) {
					count++;
				}
			}else {
				String kaku = tap.substring(i, i+1);
				if(kaku.equals("L") || kaku.equals("U") || kaku.equals("D")) {
					count++;
				}
			}
		}

		System.out.println(count == tap.length()?"Yes":"No");
		scan.close();

	}

}
