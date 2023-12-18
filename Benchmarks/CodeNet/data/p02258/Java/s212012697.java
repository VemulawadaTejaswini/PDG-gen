import java.util.Scanner;

/**
 * Created by shoya on 2017/04/14.
 */
public class Main {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int currentmin = 1 << 30;
        int maxpro = 0;
        for (int i = 0; i < n; i++){
            int a = sc.nextInt();
           if (maxpro < a - currentmin)
                maxpro = a - currentmin;
            if (currentmin > a)
                currentmin = a;
 
        }
        System.out.println(maxpro);
        return;
    }
}