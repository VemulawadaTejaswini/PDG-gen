import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String ans = s + "s";
        if(s.endsWith("s")) {
            ans = s + "es";
        }
        System.out.println(ans);
    }
}
