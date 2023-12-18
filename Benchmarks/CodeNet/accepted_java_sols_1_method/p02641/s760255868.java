import java.util.*;

public class Main {

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i<n; i++ ) {
            int p = scan.nextInt();
            list.add(p);
        }

        for (int j = 0; j<=100; j++) {
            if (!list.contains(x -j)) {
                System.out.println(x - j);
                return;
            }
            if (!list.contains(x + j)) {
                System.out.println(x +j);
                return;
            }
        }
    }
}