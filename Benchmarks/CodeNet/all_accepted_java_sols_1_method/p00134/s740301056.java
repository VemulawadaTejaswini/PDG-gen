import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int num = scn.nextInt();
            long sum = 0;
            for(int i = 0; i < num; i++) {
                sum += scn.nextLong();
            }
            System.out.println(sum / num);
        }
    }
}