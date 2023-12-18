import java.util.*;

class Main{

    class P{
        String name;
        double value;
        P(String name, double value){
            this.name = name;
            this.value = value;
        }
    }

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n==0) break;

            PriorityQueue<P> q = new PriorityQueue<P>(10, new Comparator<P>(){
                    public int compare(P a, P b){
                        if(a.value<b.value) return 1;
                        if(a.value>b.value) return -1;
                        else{
                            int min = Math.min(a.name.length(), b.name.length());
                            for(int i=0; i<min; i++){
                                if(a.name.charAt(i)==b.name.charAt(i)) continue;
                                if(a.name.charAt(i)<b.name.charAt(i)) return -1;
                                else if(a.name.charAt(i)>b.name.charAt(i)) return 1;
                            }
                            if(a.name.length()<b.name.length()) return -1;
                            else if(a.name.length()>b.name.length()) return 1;
                        }
                        return 0;
                    }
                });

            for(int i=0; i<n; i++){
                String l = sc.next();
                int p = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
                int d = sc.nextInt(), e = sc.nextInt(), f = sc.nextInt(), s = sc.nextInt();
                int m = sc.nextInt();

                int time = (a + b + c) + (d + e) * m;
                int mo = -p + (f * s) * m;
                q.add(new P(l, (double)mo/time));
            }

            while(q.size()>0){
                P pp = q.poll();
                System.out.println(pp.name);
            }
            System.out.println("#");
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}