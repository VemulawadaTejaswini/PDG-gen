import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int cnt = 0;
		int n = c.nextInt();
		int x = c.nextInt();
		while(n != 0 || x != 0){
			for( int i = 1 ; i <= n  ; i++){
				for( int w = i+1 ; w <= n -i ; w++){
					for( int r = w+1 ; r <= n; r++){
						if( i+w+r == x && i != w && i != r && r != w){
							cnt += 1;						}
					}
				}
			}
			System.out.println(cnt);
			n = c.nextInt();
			x = c.nextInt();
			cnt = 0;
		}

	}
}