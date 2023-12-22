import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] dic = new int[N+1];
        for(int i=1;i<=Math.min(9,N);i++){
            dic[i] = i;
        }
        for(int i=10;i<=N;i++){
            dic[i] = i%10+dic[i/10];
        }
        long ans = 0;
        for(int i=1;i<=N;i++){
            if(dic[i]>=A&&dic[i]<=B) ans += i;
        }
        System.out.println(ans);
    }
}