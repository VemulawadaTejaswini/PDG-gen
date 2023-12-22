import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] h = new int[N];
        for(int i = 0; i < N; i++) h[i] = sc.nextInt();
        int ans = 0;
        boolean con = true;
        while(con){
            con = false;
            int min = Integer.MAX_VALUE;
            int s = 0;
            for(int i = 0; i < N; i++){
                if(h[i] == 0 ){
                    if(s < i){
                        for(int j = s; j < i; j++) h[j] -= min;
                        ans += min;
                        min = Integer.MAX_VALUE;
                    }
                    s = i +1;
                }else if(h[i] < min){
                    min = h[i];
                    con = true;
                }
            }
            if(s < N){
                for(int j = s; j < N; j++) h[j] -= min;
                ans += min;
                min = Integer.MAX_VALUE;
            }
        }

        System.out.println(ans);
        sc.close();
    }

}
