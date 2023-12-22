import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int t = in.nextInt();
        System.out.println((int)Math.ceil(n/(double)x)*t);
    }
}
