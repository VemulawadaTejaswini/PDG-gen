import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Set<Integer> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int N = scanner.nextInt();
        int[] p = new int[N];
        int tmp;
        for(int i = 0; i < N; i++) {
            tmp = scanner.nextInt();
            set.add(tmp);
        }
        int min = Math.abs(-102) - X;
        int val = -102;
        for(int i = -101; i < 102; i++) {
            if(set.contains(i)) continue;
            int t = Math.abs(i - X);
            if(t < min) {
                min = t;
                val = i;
            }else if(t == min && i < val ){
                val = i;
            }
        }
        System.out.println(val);
    }
}