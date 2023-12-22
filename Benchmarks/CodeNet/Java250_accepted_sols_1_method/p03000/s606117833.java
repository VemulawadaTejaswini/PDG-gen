import java.util.*;

public class Main {
    public static void main(String[] args) {

        int sum = 0;
        int sumN = 1;
        int prevL = 0;

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        ArrayList<Integer> ary = new ArrayList<>();
        ary.add(0);

        for (int i = 1 ; i < n + 1 ; i ++) {
            int l = Integer.parseInt(sc.next());
            sum = prevL + l;
            if (sum <= x) {
                ary.add(0);
            }
            prevL = sum;
        }
        System.out.print(ary.size());
    }
}