import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int sp1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            sp1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int sp2[] = new int[n1];
        for (int i = 0; i < n2; i++) {
            sp2[i] = sc.nextInt();
        }
        int sum = 0;
        for (int j = 0; j < n2; j++) {
            if ( Arrays.binarySearch(sp1, sp2[j])>0) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
