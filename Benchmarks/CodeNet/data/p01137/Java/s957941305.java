import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int e;
    public static void main(String[] args) {
        while(read()){
            solve();
        }
    }

    static boolean read(){
        e = sc.nextInt();
        if(e == 0)return false;
        return true;
    }

    static void solve(){
        int x = 0, y = 0, z = 0;
        int m = Integer.MAX_VALUE;
        for(z = 0; z*z*z  <= e; z++){
            for(y = 0; z*z*z + y * y <= e; y++){
                m = Math.min(m, z + y + (e - y * y - z*z*z));
            }
        }
        System.out.println(m);
    }

}