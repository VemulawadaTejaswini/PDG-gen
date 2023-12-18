
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int n = sc.nextInt();

        for(int i = 1; i <= n; ++i){
            int result = 0, lastF;
            int x = 1, y, z;

            for(;;){
                y = 1; z = 1;
                lastF = f(x, y, z);
                if(lastF > i) break;

                for(;;){
                    z = 1;
                    lastF = f(x, y, z);
                    if(lastF > i) break;

                    for(;;){
                        lastF = f(x, y, z);
                        if(lastF > i) break;
                        else if(lastF == i) ++result;
                        ++z;
                    }
                    ++y;
                }
                ++x;
            }
            System.out.println(result);
        }
    }
    private static int f(int x, int y, int z){
        return x*x + y*y + z*z + x*y + y*z + x*z;
    }
}
