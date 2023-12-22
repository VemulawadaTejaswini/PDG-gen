import java.util.Scanner;
import java.util.*;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int h = scan.nextInt();

                int sum = 0;
                int in = 0;
                int min = 0;
                int oldIn = scan.nextInt();
                min = oldIn;
                sum = min;
                for(int i = 0; i < h - 2; i++){
                  in = scan.nextInt();
                  min = Math.min(oldIn, in);
                  sum += min;
                  oldIn = in;

                }
                sum += oldIn;
                System.out.println(sum);
    }
}
