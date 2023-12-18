
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int sosu = 1;
            if(x < 2){
                sosu = 0;
            }
                
            for (int n = 3; n <= x; n += 2) {
                int a = 3;
                int b = 0;
                while (n >= a*a && b == 0) {
                    if (n % a == 0) {
                        b = b + 1;
                    }
                    a += 2;
                }
                if (b == 0) {
                    sosu++;
                }
            }
            System.out.println(sosu);
        }
    }
}

