import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i, j, k;
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		sc.close();
		int cnt = 0;
		for(i=0;i<=a;i++) {
			for(j=0;j<=b;j++) {
				for(k=0;k<=c;k++) {
					if(x==i*500+j*100+k*50) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}