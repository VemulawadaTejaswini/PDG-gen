import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        String s = scan.next();
        String result;
        if(s.length() <= k) {
            result = s;
        } else {
            result = s.substring(0, k) + "...";
        }
        System.out.println(String.valueOf(result));

    }
}