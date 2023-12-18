import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();

        for (char c : string.toCharArray()) {
            System.out.print(Character.isUpperCase(c)?
                    Character.toLowerCase(c) : Character.toUpperCase(c));
        }
        System.out.println();
    }
}