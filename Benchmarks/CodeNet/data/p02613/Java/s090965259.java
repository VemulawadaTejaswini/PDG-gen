import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ac = 0, wa = 0, tle = 0, re = 0;
        int n = in.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.next();
        }
        for (String arr1 : arr) {
            if (arr1.contains("AC")) {
                ac++;
            } else if (arr1.contains("WA")) {
                wa++;
            } else if (arr1.contains("TLE")) {
                tle++;
            } else if (arr1.contains("RE")) {
                re++;
            }
        }
        System.out.println("AC x " + ac);
        System.out.println("WA x " + wa);
        System.out.println("TLE x " + tle);
        System.out.println("RE x " + re);

    }
}