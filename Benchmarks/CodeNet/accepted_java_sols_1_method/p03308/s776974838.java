import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int MAX=-1;
        int MIN=1000000007;
        for(int i=0;i<N;i++){
            int S=sc.nextInt();
            if(S>MAX) MAX=S;
            if(S<MIN) MIN=S;
        }
        
        System.out.println(MAX-MIN);
    }
}
