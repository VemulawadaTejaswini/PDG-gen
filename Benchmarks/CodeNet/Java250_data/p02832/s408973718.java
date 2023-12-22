import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int out = 0;
        boolean isExist = false;
        int max = 1;
        for(int i = 0; i < n; i++){
            int a = scan.nextInt();
            if(!isExist && a == 1) isExist = true;
            else if(!isExist) out++;
            else if(a != max + 1) out++;
            else max = a;
        }
        if(!isExist) System.out.println(-1);
        else System.out.println(out);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
