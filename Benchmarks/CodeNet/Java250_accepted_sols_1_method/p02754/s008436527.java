

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = Long.parseLong(scan.next());
        long blue = Long.parseLong(scan.next());
        long red = Long.parseLong(scan.next());
        scan.close();

        long total = blue + red;

        long syo = n / total;
        long amari = n % total;

        long answer = syo * blue;
        if (amari <= blue) {
            answer += amari;
        } else {
            answer += blue;
        }

        System.out.println(answer);
    }

}
