import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            num.add(scanner.nextInt());
        }
        num = new ArrayList<Integer>(new LinkedHashSet<Integer>(num));
        System.out.println(num.size());

    }
}