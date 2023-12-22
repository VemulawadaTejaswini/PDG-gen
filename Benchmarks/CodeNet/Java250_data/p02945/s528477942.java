
import java.util.Scanner;

public class Main {
    public static boolean debug = true;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int p = a + b;
        int m = a - b;
        int d = a * b;

        if(p>m){
            if(p>d) {
                System.out.println(p);
            }else{
                System.out.println(d);
            }
        }else{
            if(m>d) {
                System.out.println(m);
            }else{
                System.out.println(d);
            }

        }


    }
}
