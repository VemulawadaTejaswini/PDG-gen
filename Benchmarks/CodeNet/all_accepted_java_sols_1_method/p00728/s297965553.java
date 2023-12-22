import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while(n != 0){
            double S = 0;
            int max = -1, min = 1001;

            for(int i = 0; i < n; i++){
                int a = scanner.nextInt();
                S += a;
                if(a < min) min = a;
                if(a > max) max = a;
            }
            System.out.println((int)((S - (min + max)) / (n - 2)));

            n = scanner.nextInt();
        }
    }
}

