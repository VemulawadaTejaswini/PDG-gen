import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char i = 97; i < 123; i++) {
            map.put(i, 0);
        }
        while (scanner.hasNextLine()) {
            text += scanner.nextLine().toLowerCase();
        }
        for (int i = 0; i < text.length(); i++) {
            map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0) + 1);
        }
        for (char key = 97; key < 123; key++) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}

