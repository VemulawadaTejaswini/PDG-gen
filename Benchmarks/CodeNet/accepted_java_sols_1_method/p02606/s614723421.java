
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int l = sc.nextInt(), r = sc.nextInt(), d = sc.nextInt();

        if(l % d != 0) l += (d - l % d);
        if(r % d != 0) r -= r % d;

        System.out.println((r - l) / d + 1);
    }
}
