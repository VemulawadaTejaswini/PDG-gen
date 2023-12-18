import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int weeks = sc.nextInt();

        int debt = (int) Math.round(100000 * Math.pow(1.05, weeks) / 10000) * 10000;

        System.out.println(debt);
    }
}