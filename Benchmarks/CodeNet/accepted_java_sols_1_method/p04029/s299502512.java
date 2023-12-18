
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X=0,N;
        N = input.nextInt();
        for (int i = 1; i <= N; i++) {
            X+=i;
        }
        System.out.println(X);
    }
    
}
