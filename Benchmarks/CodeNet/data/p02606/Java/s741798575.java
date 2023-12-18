
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int l = sc.nextInt(), r = sc.nextInt(), d = sc.nextInt();

        System.out.println((r + 1 - l) / d);
    }
}
