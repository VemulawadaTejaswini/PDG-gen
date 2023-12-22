import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        List<Integer> aList = new ArrayList<>();
        for (int i = 0; i < n; i++) aList.add(sc.nextInt());
        List<Integer> bList = new ArrayList<>();
        for (int i = 0; i < m; i++) bList.add(sc.nextInt());

        if (x > y) {
            System.out.println("War");
            return;
        }

        List<Integer> options = new ArrayList<>();
        for (int i = x+1; i <= y; i++) options.add(i);

        List<Integer> options2 = new ArrayList<>();
        for (int i = 0; i < options.size(); i++) {
            boolean isWar = false;
            for (int j = 0; j < n; j++) {
                if (!(aList.get(j) < options.get(i))) {
                    isWar = true;
                    break;
                }
            }
            if (!isWar) options2.add(options.get(i));
        }
        if (options2.size() < 1) {
            System.out.println("War");
            return;
        }

        List<Integer> options3 = new ArrayList<>();
        for (int i = 0; i < options2.size(); i++) {
            boolean isWar = false;
            for (int j = 0; j < m; j++) {
                if (!(bList.get(j) >= options2.get(i))) {
                    isWar = true;
                    break;
                }
            }
            if (!isWar) options3.add(options.get(i));
        }

        if (options3.size() > 0) System.out.println("No War");
        else System.out.println("War");
    }
}