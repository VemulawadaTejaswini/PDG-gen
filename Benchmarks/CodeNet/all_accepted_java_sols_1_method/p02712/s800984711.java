import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        long sum = 0;
        for (int i=1; i<=num; i++) {
            if (i % 5 == 0 || i % 3 == 0) continue;
            else sum+=i;
        }

        System.out.println(sum);
    }
}
