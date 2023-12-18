import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int countflag = 0;

        for(int i = 1; i <= n; i++) {
            countflag = 0;

            for(int x = 1; x <= n / 3; x++) {
                for(int y = 1; y <= n / 3; y++) {
                    for(int z = 1; z <= n / 3; z++) {
                        if(((x*x) + (y*y) + (z*z) + (x*y) + (y*z) + (z*x)) == i) {
                            countflag++;
                        }
                    }
                }
            }
            System.out.println(countflag);
        }

        scanner.close();
        
    }
}