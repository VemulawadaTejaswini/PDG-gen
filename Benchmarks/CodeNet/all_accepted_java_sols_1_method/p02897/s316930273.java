import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int count = 0;
        for (double i=1; i<=N; i++) {
            if (i%2 != 0) {
                count++;
            }
        }
        double result = (double) count/N;
        System.out.println(String.format("%.10f", result));
    }
}
