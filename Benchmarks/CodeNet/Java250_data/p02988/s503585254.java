import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int cnt = 0;
        List<Integer> sortAry = new ArrayList<>();
        int[] ary = new int[n];
        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i+2 < n; i++) {
            sortAry.add(ary[i]);
            sortAry.add(ary[i+1]);
            sortAry.add(ary[i+2]);
            Collections.sort(sortAry);
            if (ary[i+1] == sortAry.get(1)) {
                cnt++;
            }
            sortAry.clear();
        }
        System.out.println(cnt);
    }
}