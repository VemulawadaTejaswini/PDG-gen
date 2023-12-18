
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int n = scan.nextInt();

            int sosu = 0;
            if( n >= 2 ){
                sosu++;
            }
            for (int x = 3; x <= n; x+=2) {
                int notSosuFlag = 0;
                for (int i = 3; i*i <= x && notSosuFlag == 0; i+=2) {
                    if (x % i == 0) {
                        notSosuFlag = 1;
                    }
                }

                if (notSosuFlag == 0) {
                    sosu++;
                }
            }

            System.out.println(sosu);

        }
    }
}

