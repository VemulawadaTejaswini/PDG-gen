import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int f = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            if (m == -1 && f == -1 && r == -1) {
                break;
            }
            if (m == -1 || f == -1) {
                System.out.println("F");
            } else if ((m + f) >= 80) {
                System.out.println("A");
            } else if ((m + f) >= 65) {
                System.out.println("B");
            } else if (((m + f) >= 50) || ((m + f) >= 30 && r >= 50)) {
                System.out.println("C");
            } else if ((m + f) >= 30) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }
    }
}