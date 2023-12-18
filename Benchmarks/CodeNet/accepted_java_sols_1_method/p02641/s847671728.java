import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int[][] dir = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    public static void main(String[] args) {
        int x = sc.nextInt();
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        if(!set.contains(x))
            System.out.println(x);
        else {
            int diff = 1;
            while (true) {
                int a = x - diff;
                int b = x + diff;
                if (!set.contains(a)) {
                    System.out.println(a);
                    break;
                }
                if (!set.contains(b)) {
                    System.out.println(b);
                    break;
                }
                diff++;
            }
        }
    }
}