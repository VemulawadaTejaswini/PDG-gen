import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        int left = 0, right = 0;
        for(int i=0; i<q; i++){
            int p = sc.nextInt();
            String c = sc.next();
            int n = sc.nextInt();
            if(c.equals("(")) left += n;
            else right += n;
            if(left==right) System.out.println("Yes");
            else System.out.println("No");
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}