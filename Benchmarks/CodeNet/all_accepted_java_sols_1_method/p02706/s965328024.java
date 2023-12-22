import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int holidays = sc.nextInt();
        int homeworks = sc.nextInt();

        int sum = 0;
        for (int i=0; i<homeworks; i++) {
            sum += sc.nextInt();
        }

        if (sum > holidays) System.out.println(-1);
        else System.out.println(holidays - sum);
    }
}
