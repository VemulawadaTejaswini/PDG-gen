import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        if(Character.isUpperCase(str.charAt(0))) {
            System.out.println("A");
        }else {
            System.out.println("a");
        }
    }
}