import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        if (s.contains("AC"))   {
            System.out.println("Yes");
        } else  {
            System.out.println("No");
        }
    }
}
