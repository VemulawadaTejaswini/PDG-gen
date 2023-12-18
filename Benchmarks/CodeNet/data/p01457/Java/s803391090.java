import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        long left = (long)0, right = (long)0;
        String[] ans = new String[q];
        for(int i=0; i<q; i++){
            long p = sc.nextLong();
            String c = sc.next();
            long n = sc.nextLong();
            if(c.equals("(")) left += n;
            else right += n;
            if(left==right) ans[i] = "Yes";
            else ans[i] = "No";
        }

        for(int i=0; i<q; i++) System.out.println(ans[i]);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}