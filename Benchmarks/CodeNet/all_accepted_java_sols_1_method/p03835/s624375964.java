import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int s = sc.nextInt();
		int ans = 0;
		for(int x=0;x<=k;x++) {
			for(int y=0;y<=k;y++) {
				int z = s-x-y;
				if(z>=0 && z<=k) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}

}