import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[][] map;
    static int[][] label;


    static ArrayList<String> list;

    static int M;
    static int N;
    static int T;
    static int P;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.next();
        String s2 = scanner.next();
        String s3 = scanner.next();

        String s = String.valueOf(s1.charAt(0)) + String.valueOf(s2.charAt(0)) + String.valueOf(s3.charAt(0));
//        + s2.charAt(0) + s3.charAt(0);
        System.out.println(s.toUpperCase());


    }



}
