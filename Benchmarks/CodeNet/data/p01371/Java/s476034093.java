import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);

    static int[][] stage;
    static int N;

    public static void main(String[] args) {
        while (true){
            N=s.nextInt();
            if(N==0) break;

            int num = (int)Math.pow(N,2);
//            ans = new int[num];
            stage =new int[N+1][N+1];

            for(int i=1;i<N+1;i++){
                for(int j=0;j<N+1;j++){
                    stage[i][j]=s.nextInt();
                }
            }

            boolean[] flag =new boolean[N+1];
            for(int i=0;i<N+1;i++)
                flag[i]=true;
            int answer=calc(flag,0);

            System.out.println(answer);

        }
    }

    public static int calc(boolean[] flag,int num){
        boolean[] flagNow=Arrays.copyOf(flag,flag.length);

        int[] ans =new int[N+1];
        for (int i=0;i<N+1;i++){
            ans[i]=Integer.MAX_VALUE;
        }

        if(num>0) flagNow[num]=false;

        boolean check=false;
        for(int i=1;i<N+1;i++){
            if(flagNow[i]){
                ans[i]=min(flagNow,i)+calc(flagNow,i);
                check=true;
            }
        }
        if(!check) return 0;

        Arrays.sort(ans);
        return ans[0];
    }

    public static int min(boolean[] flag,int num){
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<N+1;i++){
            if(flag[i] && !(i==num))
            ans=Math.min(ans,stage[num][i]);
        }
        return ans;
    }
}