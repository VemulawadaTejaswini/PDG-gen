import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        for (int i=1, x; (x=(new Scanner(System.in)).nextInt())!=0; i++) {
            System.out.printf("Case %d: %d\n",i,x);
        }
    }
}