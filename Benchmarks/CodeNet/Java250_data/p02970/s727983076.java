import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int cov = D+D+1;
        int ans = N/cov + Math.min(1, N%cov);
        System.out.println(ans);
    }
}