import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();

        int result = 0;

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            double calcResult = Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
            if (calcResult <= D) {
                result += 1;
            }
        }
        
        System.out.println(result);
        sc.close();
    }
}