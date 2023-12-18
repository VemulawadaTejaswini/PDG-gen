import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt(), S = sc.nextInt();
            if(n==0 && S==0) break;

            PriorityQueue<Integer> q = new PriorityQueue<Integer>(10, new Comparator<Integer>(){
                    public int compare(Integer i1, Integer i2){
                        return (int) i1 - i2;
                    }
                });
            for(int i=0; i<n; i++) q.add(new Integer(sc.nextInt()));
            Integer[] r = q.toArray(new Integer[0]);


            int cnt = 0;
            for(int i=0; i<r.length; i++){
                for(int j=r.length-1; j>i; j--){
                    if(r[i]+r[j]<=S){
                        cnt += r.length - j;
                        continue;
                    }
                }
            }
            System.out.println(cnt);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}