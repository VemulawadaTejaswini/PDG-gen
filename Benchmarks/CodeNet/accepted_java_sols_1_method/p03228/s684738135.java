import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        for(int i = 0; i < k; i++) {
            if(i % 2 == 0) {
                if(a % 2 != 0) a--;
                int giveA = a/2;
                b += giveA;
                a -= giveA;
            } else {
                if(b % 2 != 0) b--;
                int giveB = b/2;
                a += giveB;
                b -= giveB;
            }
        }
        System.out.println(a + " " + b);
    }
}

