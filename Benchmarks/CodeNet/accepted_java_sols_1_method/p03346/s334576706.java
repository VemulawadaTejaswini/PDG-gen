import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        HashSet<Integer> set = new HashSet<Integer>();
        int[] array = new int[N-1];
        Arrays.fill(array, -1);
        for (int i=0;i<N;i++) {
            int P = Integer.parseInt(sc.next());
            if (P!=N) {
                if (set.contains(P+1)) {
                    array[P-1]=0;
                } else {
                    array[P-1]=1;
                }
            }
            set.add(P);
        }

        int max = 0;
        int tmp = 0;
        for (int i=0;i<N-1;i++) {
            if (array[i]==1) {
                tmp++;
            } else {
                tmp=0;
            }
            max = Math.max(max, tmp);
        }
        System.out.println(N-max-1);
    }
}