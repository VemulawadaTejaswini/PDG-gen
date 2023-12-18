import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        double acc = 0;

        for(int i=0; i<N; i++){
            double x = scanner.nextDouble();
            String s = scanner.next();

            if(s.equals("BTC")){
                x *= 380000.0;
            }

            acc += x;
        }

        System.out.println(acc);

    }
}
