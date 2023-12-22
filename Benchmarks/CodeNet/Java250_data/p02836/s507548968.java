import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String mozi = scan.next();
		int matu = mozi.length();
		int count = 0;

		for(int i=0;i<matu;i++) {
			if(mozi.substring(i,i+1).equals(mozi.substring(matu-(i+1),matu-i))) {

				continue;

			}else {
				count++;
			}

		}

		System.out.println(count/2);
		scan.close();

	}

}
