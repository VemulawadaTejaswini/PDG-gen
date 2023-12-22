import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<n;i++)arr.add(sc.nextInt());
        Collections.sort(arr);
        int pre = 0, ans = 0;
        for(int i=0;i<n;i++) {
            if (arr.get(i) != pre) {
                pre = arr.get(i);
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}