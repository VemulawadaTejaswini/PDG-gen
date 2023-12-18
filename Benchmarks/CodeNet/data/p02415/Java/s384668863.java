import java.util.Scanner;

/**
 * Toggling Cases
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] charArray = scan.nextLine().toCharArray();
        scan.close();
        StringBuffer sb = new StringBuffer();
        for (char chara: charArray) {
            if (Character.isUpperCase(chara)) {
                sb.append(String.valueOf(chara).toLowerCase());
            } else {
                sb.append(String.valueOf(chara).toUpperCase());
            }
        }
        System.out.println(sb);
    }
}