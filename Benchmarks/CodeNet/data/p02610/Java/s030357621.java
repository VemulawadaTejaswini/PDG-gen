import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            PriorityQueue<int[]> lq = new PriorityQueue<>((x,y) -> x[0]-y[0]);
            PriorityQueue<int[]> rq = new PriorityQueue<>((x,y) -> y[0]-x[0]);
            for (int j = 0; j < n; j++) {
                int k = sc.nextInt();
                int l = sc.nextInt();
                int r = sc.nextInt();
                if(l < r){
                    rq.add(new int[]{k, l, r});
                }else{
                    lq.add(new int[]{k, l, r});
                }
            }
            long ans = 0L;
            int prek = 0;
            int[] uc = new int[n+1];
            PriorityQueue<int[]> cq = new PriorityQueue<>((x,y) -> x[1] - y[1]);
            for(int[] a : lq){
                int ck = a[0];
                int cl = a[1];
                int cr = a[2];
                if(ck != prek){
                    uc[ck] += uc[prek];
                }
                if(uc[ck] < ck){
                    uc[ck]++;
                    cq.add(a);
                    ans += (long)cl;
                }else{
                    int[] tmp = cq.peek();
                    if(tmp[1] < cl){
                        cq.poll();
                        cq.add(a);
                        ans += (long)(cl + tmp[2] -tmp[1]);
                    }else{
                        ans += (long)cr;
                    }
                }
            }
            prek = n+1;
            uc = new int[n+2];
            cq = new PriorityQueue<>((x,y) -> x[2] - y[2]);
            for(int[] a : rq){
                int ck = a[0];
                int cl = a[1];
                int cr = a[2];
                if(ck != prek){
                    uc[ck] += uc[prek];
                }
                if(uc[ck] < n-ck){
                    uc[ck]++;
                    cq.add(a);
                    ans += (long)cr;
                }else{
                    int[] tmp = cq.peek();
                    if(tmp != null && tmp[2] < cr){
                        cq.poll();
                        cq.add(a);
                        ans += (long)(cr + tmp[1] -tmp[2]);
                    }else{
                        ans += (long)cl;
                    }
                }
            }
            sb.append(ans + "\n");
        }
        System.out.println(sb.toString());
        sc.close();

    }

}

