import java.util.*;

public class Main{

    int m,n;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            m = sc.nextInt();
            n = sc.nextInt();
            if(m==0 && n==0) break;

            int[] player = new int[m];
            int num = m;

            int idx = 0;
            for(int i=0; i<n; i++){
                String s = sc.next();
                if(num==1) continue;
                if(!correct(i+1,s)){
                    player[idx] = -1;
                    num--;
                }
                while(true){
                    idx++; idx %= m;
                    if(player[idx]==0) break;
                }
            }

            idx = 0;
            int[] ans = new int[num];
            for(int i=0; i<m; i++){
                if(player[i]==0) ans[idx++] = i+1;
            }

            for(int i=0; i<num-1; i++) System.out.print(ans[i]+" ");
            System.out.println(ans[num-1]);

        }
    }

    boolean correct(int idx, String s){
        boolean b = false;
        if(idx%3==0 && idx%5==0){
            if(s.equals("FizzBuzz")) b = true;
        }else if(idx%5==0){
            if(s.equals("Buzz")) b = true;
        }else if(idx%3==0){
            if(s.equals("Fizz")) b = true;
        }else if(String.valueOf(idx).equals(s)) b = true;
        
        return b;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}