import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char c = 'c';
		int a[][] = new int[h][w];
		for(int i = 0;i < h;i++){
			int cnt = -1;
			char s[] = sc.next().toCharArray();
			for(int k = 0;k < w;k++){
				if(c == s[k]) cnt = 0;
				else if(cnt >= 0) cnt++;
				a[i][k] = cnt;
			}
		}
		for(int i = 0;i < h;i++){
			for(int k = 0;k < w;k++){
				if(k != w - 1) System.out.print(a[i][k] + " ");
				else System.out.println(a[i][k]);
			}
		}
	}
}