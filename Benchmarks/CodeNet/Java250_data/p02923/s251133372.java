
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Ent = new Scanner(System.in);
        int casos = Ent.nextInt();
        long arr[] = new long[casos];
        for (int i = 0; i < casos; i++) {
            arr[i] = Ent.nextLong();
        }
        int saltosM = 0;
        int saltosA = 0;
        for (int i = 1; i < casos; i++) {
            if (arr[i - 1] >= arr[i]) {
                saltosA++;
            } else {
                if (saltosM < saltosA) {
                    saltosM = saltosA;
                }
                saltosA = 0;
            }
        }
        if (saltosA > saltosM) {
            saltosM = saltosA;
        }
        System.out.println(saltosM);
    }
}