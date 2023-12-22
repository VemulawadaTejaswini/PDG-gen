import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] spf = new int[n + 1];

        for(int p = 2; p * p < n + 1; p++){
            if(spf[p] > 0){
                continue;
            }
            spf[p] = p;
            for(int i = p * 2; i < n + 1; i += p){
                if(spf[i] == 0){
                    spf[i] = p;
                }
            }
        }

        for(int p = 2; p < n + 1; p++){
            if(spf[p] == 0){
                spf[p] = p;
            }
        }

        long ans = 1;

        for(int i = 2; i < n + 1; i++){
            int k = i;
            HashMap<Integer,Integer> map = new HashMap<>();
            while(k != 1){
                map.put(spf[k], map.getOrDefault(spf[k], 0) + 1);
                k /= spf[k];
            }

            long f = 1;
            for(Integer in : map.values()){
                f *= in + 1;
            }

            ans += i * f;
        }


        System.out.println(ans);

    }

}
