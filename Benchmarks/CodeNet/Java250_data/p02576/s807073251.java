import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int X=sc.nextInt();
        int T=sc.nextInt();
        
        int num1=N/X;
        if(N%X>=1){
            num1+=1;
        }
        
        int ans =num1*T;
        
        System.out.println(ans);
    }
}
