import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        int nbd = Math.min(b,d);
        int nac = Math.max(a,c);

        System.out.println(Math.max(nbd-nac, 0));
    }
}
