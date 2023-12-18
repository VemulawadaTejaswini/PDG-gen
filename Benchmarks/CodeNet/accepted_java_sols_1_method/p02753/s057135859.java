import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(s.equals("AAA")||s.equals("BBB")?"No":"Yes");
    }
}
