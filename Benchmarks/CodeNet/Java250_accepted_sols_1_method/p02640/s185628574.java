import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);

		int animal = in.nextInt();
		int foot = in.nextInt();

		double kame = (foot-2*animal)/2;
		double turu = animal - kame;


		int r_kame = (int)kame;
		int r_turu = (int)turu;

		if(r_kame<0||r_turu<0) {
			System.out.println("No");
		}else if(4*r_kame+2*r_turu==foot&&r_kame+r_turu==animal) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}


	}

}
