import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] ary = new int[n];

        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(ary);

        if (ary[ary.length/2] == ary[ary.length/2 -1]) {
            System.out.print("0");
        } else {
            System.out.print(ary[ary.length/2] - ary[ary.length/2 - 1]);
        }
    }
}
