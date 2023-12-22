import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int[] A = new int[3];
        A[0] = scan.nextInt();
        A[1] = scan.nextInt();
        A[2] = scan.nextInt();
        Arrays.sort(A);
        System.out.println(A[2]-A[0]);
    }
}
