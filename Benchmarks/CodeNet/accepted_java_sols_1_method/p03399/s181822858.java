import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int minT = 0, minB = 0;

        if (a > b) {
            minT = b;
        } else {
            minT = a;
        }

        if (c > d) {
            minB = d;
        } else {
            minB = c;
        }

        System.out.println((minT + minB));
        sc.close();
    }    
}
