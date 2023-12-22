import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        long prev = sc.nextLong();
        int cnt = 0;
        for(int i = 1; i < N; i++){
            long n = sc.nextLong();
            if(prev >= n){
                cnt++;
            }else{
                if(max < cnt){
                    max = cnt;
                }
                cnt = 0;
            }
            prev = n;
        }
        if(max < cnt){
            max = cnt;
        }
        System.out.println(max);
    }
}
