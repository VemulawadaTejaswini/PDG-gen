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
        a.sort(Comparator.reverseOrder());
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i));
            if (i != a.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
}

