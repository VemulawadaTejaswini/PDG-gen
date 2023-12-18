import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        String s = sc.next();

        char c1 = s.charAt(k-1);
        String c2 = (String.valueOf(c1)).toLowerCase();

        String before = s.substring(0, k-1);
        String after = s.substring(k, s.length());

        System.out.println(before + c2 + after);

    }

}