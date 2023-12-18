import java.util.*;
 
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int ans = 0;
		for (int i=0;i<=a;i++) {
			for (int j=0;j<=b;j++) {
				int hope_c = (x-i*500-j*100)/50;
				if (0<=hope_c && hope_c <= c) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
 
}