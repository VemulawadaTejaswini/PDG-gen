import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> nums = new ArrayList<>();
        for(int i=0; i<n; ++i) {
            nums.add(sc.nextInt());
        }

        int n_max = (int)Float.NEGATIVE_INFINITY; //??????????????§
        int n_min = nums.get(0);
        for(int i=1; i<n; ++i) {
            n_max = Math.max(nums.get(i) - n_min, n_max);
            n_min = Math.min(nums.get(i), n_min);
        }

        System.out.println(n_max);
    }
}