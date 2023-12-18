import java.util.*;

class Main{

    int n, m, sz;
    char[] kakko;
    int[] a, bkt, add;

    void solve(){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        kakko = sc.next().toCharArray();

        sz = (int)Math.sqrt(n) - 1;
        a = new int[n];
        bkt = new int[n];
        add = new int[n];
        PriorityQueue<Integer> set = new PriorityQueue<Integer>(10, new Comparator<Integer>(){
                public int compare(Integer a, Integer b){
                    return (int)(a - b);
                }
            });

        a[0] = 1;
        for(int i=1; i<n; i++){
            if(kakko[i]=='(') a[i] = a[i-1] + 1;
            else{
                a[i] = a[i-1] - 1;
                set.add(new Integer(i));
            }
        }

        for(int i=0; i<n; i++){
            int min = Integer.MAX_VALUE;
            for(int j=0; j<sz && j*i<n; j++){
                min = Math.min(min, a[j * i]);
            }
            bkt[i] = min;
        }


        for(int i=0; i<m; i++){
            int q = sc.nextInt()-1;
            int idx = 0;
            if(kakko[q]=='('){
                kakko[q] = ')';
                set.add(new Integer(q));
                add(q, n, -2);
                idx = set.poll();
                kakko[idx] = '(';
                set.remove(new Integer(idx));
                add(idx, n, 2);
            }else{
                kakko[q] = '(';
                set.remove(new Integer(q));
                add(q, n, 2);
                idx = search(q);
                kakko[idx] = ')';
                add(idx, n, -2);
                set.add(new Integer(idx));
            }
            //System.out.println(Arrays.toString(kakko));
            System.out.println(idx+1);
        }
    }

    void add(int start, int last, int num){
        /*
        int from = 0;
        int to = sz;
        for(int i=0; i<n; i++){
            if(from<=start && last<=to){
                add[i] += num;
                //bkt[i] += num;
            }else{
                for(int j=from; j<to; j++){
                    if(start<=j && j<last){
                        a[j] += num;
                        if(a[j] < bkt[i]) bkt[i] = a[j];
                    }
                }
            }
            from = to;
            to += sz;
        }
        */
        for(int i=start; i<last; i++) a[i] += num;
    }

    int search(int f){
        /*
        int from = 0;
        int to = sz;
        while(!(from<=f && f<to)){
            from = to;
            to += sz;
        }
            
        for(int i=0; i<n; i++){
            if(bkt[i]+add[i]<=1){
                for(int j=Math.min(f, to-1); j>=from; j--){
                    if(a[j]+add[i]==1) return j+1;
                }
            }
            to = from;
            from -= sz;
        }
        */
        for(int i=f; i>=0; i--){
            if(a[i]==1) return i+1;
        }
        return 0;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}