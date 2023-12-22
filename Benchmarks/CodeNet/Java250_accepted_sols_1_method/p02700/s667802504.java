import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int tk = (int)Math.ceil(a/(double)d);
        int ao = (int)Math.ceil(c/(double)b);
        if (tk<ao)System.out.println("No");
        else System.out.println("Yes");
    }
}
