import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] abc = new Integer[3];
        for(int i=0; i<3; i++) {
            abc[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        sc.close();

        Arrays.sort(abc, Collections.reverseOrder());

        int target = 0;
        for(int i=0; i<k; i++) {
            abc[0] *= 2;
        }
        System.out.println(abc[0] + abc[1] + abc[2]);
    }
}
