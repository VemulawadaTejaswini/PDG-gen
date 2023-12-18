import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		for(int i=X;i<10000000;i++) {
			int x = i;
			if(x>=4&&x%2==0)continue;
			for(int j=2;j<Math.sqrt(X);j++) {
				if(x%j==0) {
					x/=j;
					break;
				}
			}
			if(x==i) {
				System.out.println(x);
				return;
			}
		}
	}
}