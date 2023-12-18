import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = "ABC";
        if(s.equals("ABC")) {
            result = "ARC";
        }
        System.out.println(result);
    }
}
