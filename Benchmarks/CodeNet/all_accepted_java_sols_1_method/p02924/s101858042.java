import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        long N = s.nextInt();
        long ans = (N * (N-1)) /2;

        System.out.println(ans);
        s.close();
    }
}