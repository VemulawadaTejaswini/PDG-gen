import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int larger = 0;
        int count = 0;

        if (a > b) {
        	larger = a;
        } else {
        	larger = b;
        }

        for (int i = 1; i <= a; i++) {
        	for (int j = 1; j <= larger; j++) {
        		if (i == j) {
        			count++;
        			//System.out.println(i + "月" + j + "日");
        		}
        	}
        }
        //System.out.println(count);
        if (a > b) {
			count--;
		}
        System.out.println(count);
	}
}