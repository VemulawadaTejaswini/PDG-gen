import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int sum = 0;
            for(int i = 0; i < 5; i++) {
                int scr = scn.nextInt();
                sum += scr > 40 ? scr : 40;
            }
            System.out.println(sum / 5);
        }
    }
}