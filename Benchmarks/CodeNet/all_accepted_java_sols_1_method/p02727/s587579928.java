import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        List<Long> listA = new ArrayList<Long>();
        List<Long> listB = new ArrayList<Long>();
        List<Long> listAll = new ArrayList<Long>();

        for (int i = 0; i < a; i++) {
            listA.add(sc.nextLong());
        }

        for (int i = 0; i < b; i++) {
            listB.add(sc.nextLong());
        }

        Collections.sort(listA, Comparator.reverseOrder());
        Collections.sort(listB, Comparator.reverseOrder());

        for (int i = 0; i < x; i++) {
            listAll.add(listA.get(i));
        }

        for (int i = 0; i < y; i++) {
            listAll.add(listB.get(i));
        }

        for (int i = 0; i < c; i++) {
            listAll.add(sc.nextLong());
        }

        Collections.sort(listAll, Comparator.reverseOrder());

        long ans = 0;

        for (int i = 0; i < x + y; i++) {
            ans += listAll.get(i);
        }

         System.out.println(ans);

        sc.close();
    }

}