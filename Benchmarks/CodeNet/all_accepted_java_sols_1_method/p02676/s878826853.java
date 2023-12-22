import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        String s = in.next();
        int len = s.length();
        if(len > k) {
            s = s.substring(0, k) + "...";
        }
        System.out.println(s);
    }
}
