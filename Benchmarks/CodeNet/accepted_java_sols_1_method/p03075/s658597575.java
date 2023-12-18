import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int[] antena = new int[5];
        for (int i = 0; i < 5; i++) {
            antena[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        boolean found = false;
        for (int i = 0 ; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (antena[j] - antena[i] > k) {
                    found = true;
                    break;
                }
            }
        }
        System.out.println(found ? ":(" : "Yay!");
    }
}
