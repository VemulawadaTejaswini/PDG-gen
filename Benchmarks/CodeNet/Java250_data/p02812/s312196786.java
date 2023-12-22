import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int length = scanner.nextInt();
        String character = scanner.next();
        character = character + "!";
        String[] charas = character.split("ABC");
        System.out.println(charas.length -1);
    }
}
