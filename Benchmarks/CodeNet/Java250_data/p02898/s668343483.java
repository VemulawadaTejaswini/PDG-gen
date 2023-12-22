import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        Integer h[] = new Integer[N];
        int c = 0;
        for (int i=0; i<N; i++) {
            h[i] = Integer.parseInt(sc.next());
            if (h[i] >= K)
                c++;
        }
        System.out.println(c);
    }
}