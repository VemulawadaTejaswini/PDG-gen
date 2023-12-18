import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        if (s.equals(s.toLowerCase())){
            System.out.println("a");
        } else {
            System.out.println("A");
        }
    }
}