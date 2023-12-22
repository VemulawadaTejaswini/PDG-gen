import java.util.Arrays;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] ball = new int[N];
        Arrays.fill(ball,1);
        ball[0] = -1;

        while(M-->0){
            int x = scan.nextInt() -1;
            int y = scan.nextInt() -1;
            if(ball[x] > 0){
                --ball[x];
                if(ball[y]>=0)++ball[y];
                else --ball[y];
            }else{
                ++ball[x];
                if(ball[y] >= 0)ball[y] *= -1;
                --ball[y];
            }
        }
        int ans = 0;
        for(int i=0;i<N;++i)if(ball[i] < 0)++ans;
        System.out.println(ans);

    }
}