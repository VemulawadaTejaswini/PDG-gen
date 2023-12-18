import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int end = 1500;
		for(int i=1;i<=n;i++) {
			int ans =0;
			for(int x=1;x<=end;x++) {
				for(int y=1;y<=end;y++) {
					for(int z=1;z<=end;z++) {
						if((x+y+z)*(x+y+z)-(x*y+y*z+z*x)==i) {
							ans++;
						}
					}
				}
			}
			System.out.println(ans);
		}
	}
}