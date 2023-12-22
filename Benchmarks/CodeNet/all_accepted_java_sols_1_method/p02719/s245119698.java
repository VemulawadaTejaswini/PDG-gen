import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
        long K=sc.nextLong();
        
        long ans=N%K;
        long ans2=K-ans;
        
        if(ans<ans2){
            System.out.println(ans);
        }else{
            System.out.println(ans2);
        }
    }
}
