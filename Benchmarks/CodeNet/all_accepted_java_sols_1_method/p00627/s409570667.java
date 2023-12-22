import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int n;
            while((n = scn.nextInt() / 4) > 0) {
                int sum = 0;
                for(int i = 0; i < n; i++) {
                    sum += scn.nextInt();
                }
                System.out.println(sum);
            }
        }
    }
}