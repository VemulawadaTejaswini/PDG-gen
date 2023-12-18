import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int max = 100000+5;
        PriorityQueue<Integer> pq = new PriorityQueue<>(10,Collections.reverseOrder());
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++) A[i]=sc.nextInt();
        int[] rec = new int[max+1];
        for(int i=0;i<N;i++) rec[A[i]]++;
        for(int i=1;i<=max;i++){
            if(rec[i]>0) pq.add(rec[i]);
        }
        if(pq.size()==1){
            System.out.println(1);
            System.exit(0);
        }
        while(pq.size()>1&&pq.peek()>1){
            int cur = pq.poll();
            if(cur>=3&&cur%2==1) {
                pq.add(1);
                continue;
            }
            if(cur%2==0){
                int next = pq.poll();
                if(next==1) pq.add(1);
                else{
                    pq.add(1);
                    pq.add(next-1);
                }
            }
        }
        System.out.println(pq.size());
    }
}
