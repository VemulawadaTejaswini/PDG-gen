import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        
        if((b - a) % 2 == 0) {
            System.out.println((b - a) / 2);
        } else {
            long side1 = a;
            long aCopy = 1;
            long bCopy = b - a;
            side1 += (bCopy - aCopy) / 2;

            long sideN = n - b + 1;
            aCopy = a + (n - b + 1);
            bCopy = n;
            sideN += (bCopy - aCopy) / 2;

            System.out.println(Math.min(side1, sideN));
        }        
    }
}