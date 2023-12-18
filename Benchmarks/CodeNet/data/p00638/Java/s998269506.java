import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int n;
            while((n = scn.nextInt()) > 0) {
                int sum = 0;
                int max = 0;
                while(n-- > 0) {
                    sum += scn.nextInt();
                    max = Math.max(max, scn.nextInt());
                }
                System.out.println(max < sum ? "No" : "Yes");
            }
        }
    }
}