import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] ar = new int[t];
        for (int i = 0; i < t; i++) {
            ar[i] = scan.nextInt();
        }

        Arrays.sort(ar);
        double result = ar[0];
        for (int i = 0; i < ar.length; i++) {
            result = (result+ar[i])/2;
        }

        System.out.println(result);
    }
}
