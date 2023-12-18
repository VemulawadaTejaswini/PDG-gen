import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = scanner.nextLine();
        ArrayList<String> t = new ArrayList<String>();

        while (true) {
            String word = scanner.next();
            if (word.equals("END_OF_TEXT")) {
                break;
            }
            t.add(word.toLowerCase());
        }

        int count = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).equals(w)) {
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}

