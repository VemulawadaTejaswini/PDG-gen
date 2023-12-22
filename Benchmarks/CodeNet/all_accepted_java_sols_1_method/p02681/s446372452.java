import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String t = input.next();
        if (s.equals(t.substring(0,s.length()))){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
