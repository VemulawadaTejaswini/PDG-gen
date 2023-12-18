import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int com =0;
			int n = sc.nextInt();
			int x = sc.nextInt();
			if(n == 0 && x ==0)break;
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j < i; j++) {
					for(int k = 1; k < j; k++) {
						if(i + j +  k == x) {
							com = com + 1;
						}else if(x < i + j + k ) {
							break;
						}

					}
				}
			}
			System.out.println(com);
		}
	}
}

