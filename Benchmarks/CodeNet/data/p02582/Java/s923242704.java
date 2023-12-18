import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int result = 0;
        if (s.indexOf("RRR") > -1) {
            result = 3;
        } else if (s.indexOf("RR") > -1) {
            result = 2;
        } else if (s.indexOf("R") > -1) {
            result = 1;
        }
        System.out.println(result);

    }
}