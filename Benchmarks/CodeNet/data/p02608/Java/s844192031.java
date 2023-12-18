import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int end = 100;
		loop:for(int i=1;i<=n;i++) {
			int ans =0;
			for(int x=1;x<=end;x++) {
				for(int y=1;y<=end;y++) {
					for(int z=end;z!=0;z--) {
						if((x+y+z)*(x+y+z)-(x*y+y*z+z*x)==i) {
							ans++;
						}
						if((x+y+z)*(x+y+z)-(x*y+y*z+z*x)<=-1){
							break loop;
						}
					}
				}
			}
			System.out.println(ans);
		}
	}
}