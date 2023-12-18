import java.util.*;

class Main{

    class Idle{
        String name;
        int m;
        int[] d;
        int point = 0;
        Idle(String name, int m, int[] d){
            this.name = name;
            this.m = m;
            this.d = d;
        }
    }

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n==0) break;

            int[] cnt = new int[30];
            Arrays.fill(cnt, n+1);

            Idle[] idle = new Idle[n];
            for(int i=0; i<n; i++){
                String name = sc.next();
                int m = sc.nextInt();
                int[] d = new int[m];
                for(int j=0; j<m; j++){
                    d[j] = sc.nextInt();
                    cnt[d[j]]--;
                }
                idle[i] = new Idle(name, m, d);
            }

            for(int i=0; i<n; i++){
                int point = 0;
                for(int j=0; j<idle[i].m; j++){
                    point += cnt[idle[i].d[j]];
                }
                idle[i].point = point;
            }

            Arrays.sort(idle, new Comparator<Idle>(){
                    public int compare(Idle i1, Idle i2){
                        if(i1.point<i2.point) return -1;
                        if(i1.point>i2.point) return 1;
                        String n1 = i1.name, n2 = i2.name;
                        int len1 = n1.length(), len2 = n2.length();
                        for(int i=0; i<Math.min(len1, len2); i++){
                            if(n1.charAt(i)<n2.charAt(i)) return -1;
                            if(n1.charAt(i)>n2.charAt(i)) return 1;
                        }
                        if(len1<len2) return -1;
                        if(len1>len2) return 1;
                        return 0;
                    }
                });

            System.out.println(idle[0].point+" "+idle[0].name);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}