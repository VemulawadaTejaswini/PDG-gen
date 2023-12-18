import java.util.*;

public class Main {
    static int fun(int n){
        int ans=100000;
        for(int i=0;i<n;i++){
            int x=(int)(ans*0.05),y=0;
            if (x%1000>0)y=1000;
            ans=ans+x+y-x%1000;
        }
        return ans;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(fun(sc.nextInt()));
    }
}
