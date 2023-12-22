import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int weeks = sc.nextInt();

        int debt = 100000;

        for (int i = 0; i < weeks; i++) {
            debt = (int) Math.ceil((debt * 1.05) / 1000) * 1000;
        }

        System.out.println(debt);
    }
}