import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        ArrayList<Long> aList = new ArrayList<>();
        for (var i = 0; i < N; i++)
            aList.add(sc.nextLong());
        aList.sort(Comparator.reverseOrder());
        long ans = 0;
        for (var i = 0; i < N - 1; i++)
            ans += aList.get(i);
        System.out.println(ans);
    }
}
