import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;

		while(i <= n) {
			int x = i;
			if (x % 3 == 0 ) {
				System.out.print(" " + i);
				i++;
			}else if (x % 10 == 3 ) {
				System.out.print(" " + i);
				i++;
			}else { //ここの中考える
				x /= 10;
				if(x == 0)
					;
				else if(x >= 1) {
					while(x >= 1) {
						if(x % 10 == 3 ) {
							System.out.print(" " + i);
							x /= 10000;
						}else {
							x /= 10;
						}
					}
				}
				i++;
			}
		}
		System.out.println();
		sc.close();
	}
}
