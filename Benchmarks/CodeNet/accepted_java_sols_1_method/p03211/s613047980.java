import java.util.Scanner;

public class Main {

    public static int aa = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < s.length() - 2; i ++) {
//            System.out.println(s.substring(i, i+3));
            min = Math.min(min, Math.abs(Math.min(min, Integer.valueOf(s.substring(i, i+3))-753)));
        }
        System.out.println(min);
    }
}