import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);

		int animal = in.nextInt();
		int foot = in.nextInt();

		double kame = (foot-2*animal)/2;
		double turu = animal - kame;


		int r = (int)kame;
		int r1 = (int)turu;

		if(foot-2*animal<0) {
			System.out.println("No");
		}else if(kame-r==0&&turu-r1==0&&(r<=animal||r1<=animal)&&0<=r&&0<=r1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
