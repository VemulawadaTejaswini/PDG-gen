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
        ArrayList<String> a = new ArrayList<String>();
        try {
            int i = 1;
            while (i <= 10000) {
                a.add("Case " + i + ": " + scanner.nextInt());
                i++;
            }
        } catch (InputMismatchException e) {
            //
        } catch (NoSuchElementException e) {
            //
        }
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        scanner.close();
    }
}

