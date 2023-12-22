import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];

        for (int i=0; i<num-1; i++) {
            int bossNum = sc.nextInt() - 1;
            array[bossNum]++;
        }

        for (int i: array) {
            System.out.println(i);
        }
    }
}
