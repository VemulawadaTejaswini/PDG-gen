import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder("");
        int[] sides = new int[3];
        for (int i = 0; i < n; i++) {
            sides[0] = sc.nextInt();
            sides[1] = sc.nextInt();
            sides[2] = sc.nextInt();
            Arrays.sort(sides);
            sb.append((sides[2] * sides[2] == sides[1] * sides[1] + sides[0] * sides[0]) ? "YES" : "NO");
            sb.append('\n');
        }
        System.out.print(sb);
    }
}