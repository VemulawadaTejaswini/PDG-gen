import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] hills = new int[10];
            Scanner sc = new Scanner(System.in);
            for(int i = 0; i < hills.length; i++) {
                hills[i] = sc.nextInt();
        }

        Arrays.sort(hills);

        for(int i = 9; i > 6; i--) {
            System.out.println(hills[i]);
        }
    }
}
