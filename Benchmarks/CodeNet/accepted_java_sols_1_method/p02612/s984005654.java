import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        
        System.out.println(N % 1000 == 0 ? 0 : 1000 - N % 1000);
    }
}
