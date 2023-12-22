
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int n = sc.nextInt();
        int result = 0;

        for(int i = 1; i <= n; ++i){
            int a = sc.nextInt();
            if(a % 2 == 1 && i % 2 == 1) ++result;
        }

        System.out.println(result);
    }
}
