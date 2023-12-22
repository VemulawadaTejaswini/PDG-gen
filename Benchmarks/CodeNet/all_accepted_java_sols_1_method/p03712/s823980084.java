import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int w = scan.nextInt();
		String[] s = new String[h];//sはw文字
		StringBuilder soto = new StringBuilder();
		soto.append("##");
		for(int i=0;i<h;i++) {
			s[i]=scan.next();
		}
		for(int i=0;i<w;i++) {
			soto.append("#");
		}
		System.out.println(soto);

		for (int i=0;i<h;i++) {
			System.out.print("#");
			System.out.print(s[i]);
			System.out.println("#");
		}
		System.out.println(soto);
	}

}
