import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] ar = new int[200001];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            int Ai = sc.nextInt();
            ar[Ai]++;
            set.add(Ai);
        }
        Arrays.sort(ar);
        int dir = set.size()-K;
        int count = 0;
        for (int a : ar) {
            if (a == 0) {
                continue;
            } else {
                if (dir <= 0) {
                    break;
                }
                count += a;
                dir--;
            }
        }
        System.out.println(count);
    }
}