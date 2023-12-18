import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int d = in.nextInt();
        int x = in.nextInt();
        for(int i=1; i<=10; i++) {
            x = x * r - d;
            System.out.println(x);
        }
    }
}
