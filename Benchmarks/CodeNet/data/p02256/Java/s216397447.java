import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
        if (y < x) {
            int temp = x;
            x = y;
            y = temp;
        }
        int z = y % x;
        while (z != 0) {
            y = x;
            x = z;
            z = y % x;
        }
        System.out.println(x);
		sc.close();
	}    
}
