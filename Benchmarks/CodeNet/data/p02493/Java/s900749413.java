import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    private static String join(ArrayList<Integer> ls) {
        StringBuilder sb = new StringBuilder();
        for (Integer n: ls) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(n);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int noItems = scan.nextInt();
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for (int i = 0; i < noItems; i++) {
            ls.add(scan.nextInt());
        }
        Collections.reverse(ls);

        System.out.println(join(ls));
    }
}