import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        // input
        Scanner scanner = new Scanner(System.in);
        int[] a=new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = Integer.parseInt(scanner.next());
        }
        int k = Integer.parseInt(scanner.next());
        scanner.close();
        //solve
        String message;
        if (Math.abs(a[0] - a[4]) <= k) {
            message="Yay!";
        } else {
            message=":(";
        }
        // output
        System.out.println(message);
        System.out.flush();
    }
}