import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            int N = sc.nextInt();
            int M = sc.nextInt();
            if(N+M==0)break;
            int[][]p =new int[N][2];
            long ans=0;
            for (int i = 0; i < N; i++) {
                p[i][0]=sc.nextInt();
                p[i][1]=sc.nextInt();
                ans+=(long)p[i][0]*p[i][1];
            }
            Arrays.sort(p,new Comparator<int[]>(){
                @Override
                public int compare(int[] arg0, int[] arg1) {
                    return arg1[1]-arg0[1];
                }
            });
            for (int i = 0; i < p.length; i++) {
                ans = ans - p[i][1]*Math.min(p[i][0], M);
                M = M - p[i][0];
                if(M<=0)break;
            }
            System.out.println(ans);
        }
    }

}