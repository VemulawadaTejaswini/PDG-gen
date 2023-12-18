import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = 0;
        int r = 0;
        double f = 0;
        
        d = a / b;
        r = a % b;
        f = (double)a / b;
        
    System.out.printf("%d %d %.6f\n", d, r, f);    
    }
}

