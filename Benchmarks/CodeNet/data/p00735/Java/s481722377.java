import java.util.*;

public class Main{
    void run(){
        int MAX = 300000;
        Scanner sc = new Scanner(System.in);
        boolean[] is_MS_Prime = new boolean[MAX+1];
        Arrays.fill(is_MS_Prime, true);
        is_MS_Prime[0] = is_MS_Prime[1] = false;
        for(int i = 0; i <= MAX; i++){
            if(!is_MS_Prime[i]){
                continue;
            }
            if(i % 7 != 1 && i % 7 != 6){
                is_MS_Prime[i] = false;
            }
            else{
                for(int ii = i + i; ii <= MAX; ii += i){
                    is_MS_Prime[ii] = false;
                }
            }
        }
        //System.out.println(Arrays.toString(is_MS_Prime));
        while(true){
            int n = sc.nextInt();
            if(n == 1){
                break;
            }
            String ans = n + ":";
            for(int i = 6; i <= n; i++){
                if(is_MS_Prime[i] && n % i == 0){
                    ans = ans + " " + i;
                }
            }
            System.out.println(ans);
        }
    }
    public static void main(String[] args){
        new Main().run();
    }
}