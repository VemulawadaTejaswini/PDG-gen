import java.util.*;
import java.util.Scanner;

class Main {
    static int q, x, p;
    static ArrayList<Integer> list;

    public static void main(String[] args) {
        int query;
        list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        q = sc.nextInt();
        for (int i = 1; i <= q; i++) {
			query = sc.nextInt();
            switch (query) {
                case 0:
                    list.add(sc.nextInt());
                    break;
                case 1:
                    System.out.println(list.get(sc.nextInt()));
                    break;
                case 2:
                    list.remove(list.size() -1);
            }
        }
    }
}
