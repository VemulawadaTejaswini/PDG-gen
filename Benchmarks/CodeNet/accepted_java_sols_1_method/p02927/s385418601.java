import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        int d1, d10,sum = 0;

        for(int i = 1; i <= m; i++) {
        	for(int j = 22; j <= d; j++) {
        		d1 = j % 10;
                d10 = j / 10;
                sum += (d1 >= 2)&&(d10 >= 2)&&(i == d1 * d10) ? 1: 0;
        		
        	}
        }
        System.out.println(sum);
	}

}
