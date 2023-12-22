import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = sc.nextInt();
        int count = 1;

        for (int i=0; i<num-1; i++) {
            int input = sc.nextInt();

            if (input >= max) {
                count++;
                max = input;
            }
        }

        System.out.println(count);
    }
}
