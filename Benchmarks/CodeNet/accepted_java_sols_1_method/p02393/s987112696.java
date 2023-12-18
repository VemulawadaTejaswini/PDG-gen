import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(scanner.nextInt());
        a.add(scanner.nextInt());
        a.add(scanner.nextInt());
        a.sort(null);
        System.out.println(a.get(0) + " " + a.get(1) + " " + a.get(2));
        scanner.close();
    }
}

