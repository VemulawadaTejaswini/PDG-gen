import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = -sc.nextInt();
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder("");
        sb.append(-arr[0]);
        for (int i = 1; i < 5; i++) {
            sb.append(' ');
            sb.append(-arr[i]);
        }
        System.out.println(sb);
    }
}