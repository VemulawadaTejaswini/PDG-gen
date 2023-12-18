import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int ans = Math.max(a + b, Math.max(2*a-1, 2*b-1) ); 

        System.out.println(ans);
    }
}