import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int count=0;
		int genzai =1;
		for(int i=0;i<n;i++) {
			genzai=Math.min(genzai*2, genzai+k);
		}
		System.out.println(genzai);
	}
}
