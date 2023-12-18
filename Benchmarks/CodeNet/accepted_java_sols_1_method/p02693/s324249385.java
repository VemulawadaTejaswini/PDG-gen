import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int adiv = (int)Math.floor(a/(double)k);
        int bdiv = (int)Math.floor(b/(double)k);
        int amod = a%k;
        int bmod = b%k;
        System.out.println(adiv<bdiv || amod==0 || bmod==0 ? "OK" : "NG");
    }
}
