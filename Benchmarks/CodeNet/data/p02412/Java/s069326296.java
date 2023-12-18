import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f = 0;
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		for(int i = 1 ; i <= n-2 ; i++) {
			for(int j = i+1 ; j <= n-1 ; j++ ) {
				for(int k = j+1 ; k <= n ; k++) {
					if(i+j+k == x) {
						f++;
					}
				}
			}
		}
		
		System.out.println(f);
		
		sc.close();
	}

}