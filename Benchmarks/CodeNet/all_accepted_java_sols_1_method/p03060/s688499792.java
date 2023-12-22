import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] jew = new int[N];
        int[] val = new int[N];

        int X = 0;
        int Y = 0;
        

        for(int i = 0;i < N;i++){
            jew[i] = sc.nextInt();
        }

        for(int i = 0;i < N ;i++){
            val[i] = sc.nextInt();
        }

        for(int i = 0;i < N;i++){
            if(jew[i] < val[i]){
                jew[i] = 0;
                val[i] = 0;
            }
            X += jew[i];
            Y += val[i];
        }

        int ans = X-Y;
        System.out.println(ans);
    }
}