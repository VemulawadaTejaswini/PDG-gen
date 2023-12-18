import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int cnt = 0;
		int n = c.nextInt();
		int x = c.nextInt();
		while(n != 0 || x != 0){
			for( int i = 1 ; i <= n -3 ; i++){
				for( int w = 2 ; w <= n - i; w++){
					for( int r = 3 ; r <=  n; r++){
						if( i+w+r == x && i != w && i != r && r != w){
							cnt += 1;
						}
					}
				}
			}
			n = c.nextInt();
			x = c.nextInt();
		}
		System.out.println(cnt);
	}

}