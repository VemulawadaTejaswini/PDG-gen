import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        long[] w = new long[N];
        long[] v = new long[N];
        for(int i=0;i<N;i++){
            w[i] = sc.nextLong();
            v[i] = sc.nextLong();
        }
        ArrayList<Long>[] a1 = new ArrayList[4];
        for(int i=0;i<4;i++) a1[i] = new ArrayList<>();
        for(int i=0;i<N;i++){
            a1[(int)(w[i]-w[0])].add(v[i]);
        }
        Long[][] map = new Long[4][];
        for(int i=0;i<4;i++){
            map[i] = new Long[a1[i].size()];
            map[i] = a1[i].toArray(map[i]);
            Arrays.sort(map[i],Comparator.reverseOrder());
        }
        long[][] sum = new long[4][];
        for(int i=0;i<4;i++){
            sum[i] = new long[map[i].length+1];
            for(int j=1;j<sum[i].length;j++){
                sum[i][j] = sum[i][j-1]+map[i][j-1];
            }
        }
        long ans = 0;
        for(int a=0;a<sum[0].length;a++){
            for(int b=0;b<sum[1].length;b++){
                for(int c=0;c<sum[2].length;c++){
                    for(int d=0;d<sum[3].length;d++){
                        long cur = sum[0][a]+sum[1][b]+sum[2][c]+sum[3][d];
                        long weight = (a+b+c+d)*w[0]+b+2*c+3*d;
                        if(weight<=W) ans = Math.max(ans,cur);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
