
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer>[] next = new List[n];
        for(int i=0; i<n; i++) {
            next[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<m; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            next[a].add(b);
            next[b].add(a);
        }

        boolean[] v = new boolean[n];
        int[] p = new int[n];

        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()) {
            int a = q.poll();
            for(int b : next[a]) {
                if(!v[b]) {
                    p[b] = a;
                    q.add(b);
                    v[b] = true;
                }
            }
        }

        boolean yes = true;
        for(boolean bb : v) {
            if(!bb) {
                yes = false;
                break;
            }
        }

        if(yes) {
            System.out.println("Yes");
            for(int i=1; i<n; i++) {
                System.out.println(p[i]+1);
            }
        } else {
            System.out.println("No");
        }

    }



}