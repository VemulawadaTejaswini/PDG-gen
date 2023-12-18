import java.util.*;

/**
 * B
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a<b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        while(b != 0) {
            
            int c = a%b;
            a = b;
            b = c;

        }

        System.out.println(a);

    }
}
