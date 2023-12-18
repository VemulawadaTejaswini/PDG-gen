import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        LinkedHashSet<String> items = new LinkedHashSet<String>();
        for (int i = 0; i < N; i++) {
            items.add(scan.next());
        }
        System.out.println(items.size());
    }
}