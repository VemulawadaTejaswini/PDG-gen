import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int end = 10;
		for(int i=1;i<=n;i++) {
			int ans =0;
			for(int x=1;x<=end;x++) {
				for(int y=x;y<=end;y++) {
					for(int z=y;z<=end;z++) {
						if((x+y+z)*(x+y+z)-(x*y+y*z+z*x)==i) {
							if(x==y&&y==z&&z==x) {
								ans++;
							}else if((x==y)||(y==z)||(y==z)) {
								ans = ans + 3;
							}else {
								ans = ans + 6;
							}

						}
					}
				}
			}
			System.out.println(ans);
		}
	}
}