import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] l = new int[n*2];
        for(int i=0; i<n*2; i++) {
            l[i] = in.nextInt();
        }

        Arrays.sort(l);

        int sum = 0;
        for(int i=0; i<n*2; i+=2) {
            sum += l[i];
        }

        System.out.println(sum);

        in.close();
    }
}
