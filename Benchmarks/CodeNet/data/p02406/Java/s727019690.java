package now.Third;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1, x;
        while (true) {
            if (i % 3 == 0) {
                System.out.print(" " + i);
            } else {
                x = i + 0;
                while (x > 0) {
                    if (x % 10 == 3) {
                        System.out.print(" " + i);
                    }
                    x /= 10;
                }
            }
            if(i <= 100)break;
            i++;
        }
        System.out.print("\n");
    }
}

