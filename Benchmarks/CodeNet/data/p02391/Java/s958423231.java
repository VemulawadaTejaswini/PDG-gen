import java.util.Scanner;
 
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        StringBuilder s = new StringBuilder();
        s.append(a);
        if      (a == b) s.append(" == ");
        else if (a < b)  s.append(" < ");
        else             s.append(" > ");
        s.append(b);
        System.out.println(s);
    }
}