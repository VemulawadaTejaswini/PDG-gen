import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next());
        final int K = Integer.parseInt(sc.next());
        final int R = Integer.parseInt(sc.next());
        final int S = Integer.parseInt(sc.next());
        final int P = Integer.parseInt(sc.next());
        final char T[] = sc.next().toCharArray();
        sc.close();

        List<Character> C = new ArrayList<>();
        for (char t : T) {
            if (t=='r') {
                C.add('p');
            } else if (t=='s') {
                C.add('r');
            } else {
                C.add('s');
            }
        }
        for (int i=0; i<N-K; i++) {
            if (C.get(i)==C.get(i+K)) {
                C.set(i+K,'x');
            }
        }
        long sum = 0;
        for (int i=0; i<N; i++) {
            if (C.get(i)=='p') {
                sum += P;
            } else if (C.get(i)=='r') {
                sum += R;
            } else if (C.get(i)=='s') {
                sum += S;
            }
        }
        
        System.out.println(sum);
    }
}