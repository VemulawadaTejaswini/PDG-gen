import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candidates = new int[9];
        candidates[0] = 111;
        candidates[1] = 222;
        candidates[2] = 333;
        candidates[3] = 444;
        candidates[4] = 555;
        candidates[5] = 666;
        candidates[6] = 777;
        candidates[7] = 888;
        candidates[8] = 999;
        for(int i = 0; i < candidates.length; i++) {
            if(candidates[i] >= n) {
                System.out.println(candidates[i]);
                return;
            }
        }
    }
}