import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);
        Set<Integer> treeSet = new TreeSet<Integer>();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        for (int i = 0; i < k; i++){
            int d = scanner.nextInt();
            for (int j = 0; j < d; j++){
                treeSet.add(scanner.nextInt());
            }
        }
        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            if (!treeSet.contains(i)) {
                count++;
            }
        }
        printWriter.println(count);
        printWriter.flush();
    }
}
