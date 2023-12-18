import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int D = sc.nextInt();
        final int T = sc.nextInt();
        final int S = sc.nextInt();
        
        System.out.println(D <= S * T ? "Yes" : "No");
    }
}
