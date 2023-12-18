import java.math.*;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();

        int[] arr = new int[4];

        for (int i=0; i<n; i++) {
            String s = sc.next();
            if (s.equals("AC")) {
                arr[0]++;
            } else if (s.equals("WA")) {
                arr[1]++;
            } else if (s.equals("TLE")) {
                arr[2]++;
            } else if (s.equals("RE")) {
                arr[3]++;
            }
        }

        System.out.println("AC x " + arr[0]);
        System.out.println("WA x " + arr[1]);
        System.out.println("TLE x " + arr[2]);
        System.out.println("RE x " + arr[3]);

    }


}

