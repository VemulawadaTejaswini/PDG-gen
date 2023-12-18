import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while( ++i <= n){
			int x = i;
			if(x % 3 == 0){
				System.out.print(String.format(" %d",i));
				continue;
			}
			while(x >= 1){
				if(x % 10 == 3){
					System.out.print(String.format(" %d",i));
					break;
				}
				x = x/10;
			}
		}
		System.out.println();
	}
}

