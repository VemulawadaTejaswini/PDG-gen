import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n-i;j++) {
				int k = n-i-j;
				int total = i*10000 + j*5000 + k*1000;
				if(total==x) {
					System.out.println(i+" "+j+" "+k);
					return;
				}
			}
		}
		System.out.println("-1 -1 -1");
	}

}