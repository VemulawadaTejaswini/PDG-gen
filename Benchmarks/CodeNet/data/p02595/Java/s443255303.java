import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int d = sc.nextInt();
        int answer = 0;

        for (int i = 0; i < n; i++) {
            double x = sc.nextInt();
            double y = sc.nextInt();
            if (Math.sqrt(x * x + y * y) <= d) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}