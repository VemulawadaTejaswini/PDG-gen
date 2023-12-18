import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int n;
            while((n = scn.nextInt()) != 0) {
                int sum = 0;
                for(int m = scn.nextInt(); n <= m; n++) {
                    if(isHamming(n)) {
                        sum++;
                    }
                }
                System.out.println(sum);
            }
        }
    }

    private static boolean isHamming(int num) {
        while(num % 5 == 0) {
            num /= 5;
        }
        while(num % 3 == 0) {
            num /= 3;
        }
        while(num % 2 == 0) {
            num /= 2;
        }
        return num == 1;
    }
}