import java.util.Scanner;

//20180508
//09

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int x;

		int num = scanner.nextInt();
		for(int i = 1;i <= num;i++) {
			x = i;
			if(i % 3 == 0) {
				System.out.printf(" %d", i);
			} else {
				while(true) {
					if(x % 10 == 3) {
						System.out.printf(" %d", i);
						break;
					}
					x /= 10;
					if(x == 0) {
						break;
					}
				}
			}
		}
		System.out.println();

    	scanner.close();
    }
}
