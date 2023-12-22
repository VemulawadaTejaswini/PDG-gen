import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n-1];
        int[] b = new int[n-1];
        int[] pi = new int[n];
        int[] pc = new int[n];
        int[] ec = new int[n-1];
        Map<Long, Integer> map = new HashMap<>();
        List[] lists = new List[n];

        for(int i=0; i<n-1; i++) {
            a[i] = sc.nextInt()-1;
            b[i] = sc.nextInt()-1;
            map.put((((long)a[i]) << 20) + b[i], i);
            List list1 = lists[a[i]];
            if(list1 == null) {
                lists[a[i]] = new ArrayList<Integer>();
                list1 = lists[a[i]];
            }
            list1.add(b[i]);
            List list2 = lists[b[i]];
            if(list2 == null) {
                lists[b[i]] = new ArrayList<Integer>();
                list2 = lists[b[i]];
            }
            list2.add(a[i]);
        }

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(0);
        pi[0] = -1;
        pc[0] = -1;
        int maxc = 0;
        while(!q.isEmpty()) {
            int w = q.poll();
            int nc = 0;
            if (pc[w] == 0)
                nc++;
            for (Integer next : (List<Integer>) lists[w]) {
                if (next != pi[w]) {
                    int min = Math.min(w, next);
                    int max = Math.max(w, next);
                    long key = (((long) min) << 20) + max;
                    ec[map.get(key)] = nc;
                    pi[next] = w;
                    pc[next] = nc;
                    maxc = Math.max(nc, maxc);
                    nc++;
                    if (pc[w] == nc)
                        nc++;
                    q.offer(next);
                }
            }
        }

        System.out.println(maxc + 1);
        for(int i=0; i<n-1; i++) {
            System.out.println( ec[i] + 1);
        }



    }
}
