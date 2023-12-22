import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Integer> b = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            b.add(sc.nextInt());
        }
        sc.close();

        List<Integer> output = new ArrayList<Integer>();

        while (b.size() != 0) {
            int beforeSize = b.size();
            for (int i = b.size(); i > 0; i--) {
                if (b.get(i - 1) == i) {
                    b.remove(i - 1);
                    output.add(i);
                    break;
                }
            }
            if (beforeSize == b.size()) {
                System.out.println("-1");
                System.exit(0);
            }
        }
        for (int i = output.size() - 1; i >= 0; i--) {
            System.out.println(output.get(i));
        }
    }
}
