import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int car;
        int[] tracks = new int[100];
        int head = 0;
        StringBuilder sb = new StringBuilder("");

        while (sc.hasNextInt()) {
            car = sc.nextInt();

            if (car == 0) {
                head--;
                sb.append(tracks[head]);
                sb.append('\n');
            } else {
                tracks[head] = car;
                head++;
            }
        }

        System.out.print(sb);
    }
}