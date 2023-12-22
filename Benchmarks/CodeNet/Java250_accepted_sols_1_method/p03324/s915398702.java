import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        
        int count = 1;
        int ans = 0;
        for(int i=0; i<D; i++){
            count *= 100;
        }
        if(N<100){
            ans = count*N;
        }else{
            ans = count * 101;
        }
        
        
        System.out.println(ans);
    }
}
