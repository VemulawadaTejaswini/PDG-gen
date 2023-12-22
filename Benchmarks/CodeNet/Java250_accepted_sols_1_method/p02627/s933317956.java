import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char chr = sc.next().charAt(0);
        if (Character.isUpperCase(chr)) {
            System.out.println("A");
        } else {
            System.out.println("a");
        }
    }
}