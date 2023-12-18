import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        for (int i = a.size() - 1; i >= 0; i--) {
            System.out.print(a.get(i));
            if (i != 0) {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
}

