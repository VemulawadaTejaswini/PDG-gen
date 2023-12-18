import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int sum = sc.nextInt();
            if(sum==0) break;
            for(int i=0; i<9; i++) sum -= sc.nextInt();
            System.out.println(sum);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}