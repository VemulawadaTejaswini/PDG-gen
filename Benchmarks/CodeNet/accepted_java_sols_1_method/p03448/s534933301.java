import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int y500c = sc.nextInt();
		int y100c = sc.nextInt();
		int y50c = sc.nextInt();
		// 文字列の入力
		int x = sc.nextInt();

		int count=0;
		for(int i=0;i<=y500c;i++) {
			for(int j=0;j<=y100c;j++) {
				for(int k=0;k<=y50c;k++) {
					if(500*i + 100*j + 50*k == x)count++;
				}
			}
		}
		System.out.println(count);
	}
}
