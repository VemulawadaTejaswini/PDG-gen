import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.close();

        int mod = (int)Math.pow(10, 9)+7;
    
        long strt = 1;

        for(int i = 1; i <= N; i++){
            strt = ((strt%mod)*i)%mod;
        }

        System.out.println(strt);
    }
}