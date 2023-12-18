import java.util.Scanner;

public class practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	
        int n = sc.nextInt();
        for (int i = 3; i<=n; i++) {
            if ((i % 3) == 0) {
		System.out.printf(" "+i);
            } else  {
                int x = i;
                while (x != 0) {
                    if ((x % 10) == 3) {
			System.out.printf(" "+i);
                        break;
                    }
                    x /= 10;
                }
            }
        }
        System.out.println();
    }
}