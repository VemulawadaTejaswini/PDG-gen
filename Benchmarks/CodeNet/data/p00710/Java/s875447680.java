import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // int TC = Integer.parseInt(sc.next(), 10);
        
        while (true) {
            int N = sc.nextInt();
            int R = sc.nextInt();
            if (N == 0 && R == 0) break;
            
            int[] cards = new int[N];
            int[] temp = new int[N];
            
            for (int i = 0; i < N; i++) {
                cards[i] = N - i;
            }
            
            while (R-- > 0) {
                int p = sc.nextInt() - 1;
                int c = sc.nextInt();
                
                for (int pos = 0; pos < c; pos++) {
                    temp[pos] = cards[p + pos];
                }
                for (int i = 0; i < p; i++) {
                    temp[c + i] = cards[i];
                }
                for (int i = p + c; i < N; i++) {
                    temp[i] = cards[i];
                }
                cards = Arrays.copyOf(temp, N);
            }
            
            System.out.println(cards[0]);
        }
    }
}


