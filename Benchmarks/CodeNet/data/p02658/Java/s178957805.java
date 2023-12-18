import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        long ans = 1;
        long jdk = (long)1e18;
        
        for(int i = 0;i < n;i++){
            long a = sc.nextLong();
            ans *= a;
        }
        if(ans <= jdk ^ ans < 0L){
            System.out.println(ans);
            return;
        }
        if(String.valueOf(ans).length() > 17 || ans < 0){
            System.out.println(-1);
            return;
        }
    }
}
