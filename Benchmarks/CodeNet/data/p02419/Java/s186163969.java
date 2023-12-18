import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String keywords = scan.nextLine();
        int sum = 1;

        while (true) {
            String string = scan.nextLine();
            if(string.equals("END_OF_TEXT")) break;
            if (string.matches(".*" + keywords + ".*")) sum++;
        }
        System.out.println(sum);
    }
}