import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String s = scan.next();
		boolean flg = true;

		for(int i=0;i<n;i++) {
			if(s.substring(0,n/2).equals(s.substring(n/2,n))) {
				flg = true;
			}else {
				flg = false;
			}
		}

		System.out.println(flg?"Yes":"No");
		scan.close();

	}

}
