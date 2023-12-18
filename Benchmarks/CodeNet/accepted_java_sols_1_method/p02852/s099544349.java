import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken()) + 1;
        int m = Integer.parseInt(st.nextToken());
        String string = in.readLine();
        boolean[] bad = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (string.charAt(i) == '1') {
                bad[i] = true;
            }
        }
        int[] par = new int[n];
        Arrays.fill(par, (int)1e9);
        par[0] = 0;
        Queue<Integer> pq = new LinkedList<>();
        pq.offer(0);
        for (int i = 1; i < n; i++) {
            if (bad[i]) {
                continue;
            }
            if (!pq.isEmpty()) {
                while (!pq.isEmpty() && i - pq.peek() > m) {
                    pq.poll();
                }
                if (!pq.isEmpty()) {
                    par[i] = pq.peek();
                    pq.offer(i);
                }
            }
        }
        if (par[n-1] == (int)1e9) {
            System.out.println("-1");
            return;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = n-1; i != 0; i = par[i]) {
            stack.push(i-par[i]);
        }
        int res = stack.size();
        for (int i = 0; i < res; i++) {
            if (i > 0) {
                System.out.print(' ');
            }
            System.out.print(stack.pop());
        }
        System.out.print('\n');
    }


}
/*


 */