import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            char cout = ' ';
            if (Character.isUpperCase(c)) {
                cout = Character.toLowerCase(c);
            } else {
                cout = Character.toUpperCase(c);
            }
            output = output.concat( String.valueOf(cout));
        }
        System.out.println(output);
    }
}