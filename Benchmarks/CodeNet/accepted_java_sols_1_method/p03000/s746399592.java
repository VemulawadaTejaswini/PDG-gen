import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),x = sc.nextInt();
		int[] l = new int[n+1];
		for(int i = 1;i <= n;i++) {
			l[i] = sc.nextInt();
		}
		
		int value = 0,cnt = 1,d = 0;
		for(int i = 2;i <= n+1;i ++) {
			value = d + l[i-1];
			d = value;
			if(value > x) break;
			cnt++;
		}
		System.out.println(cnt);
	}
	
}