import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count =0;
		for(int i=0;i<n;i++) {
			int l=scan.nextInt();
			int r=scan.nextInt();
			int dantai=r-l+1;
			count = count + dantai;
		}
		System.out.println(count);

	}

}
