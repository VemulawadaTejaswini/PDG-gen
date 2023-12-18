import java.util.*;
import java.math.BigInteger; 
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int flag=0,flag1=0;
         BigInteger y=new BigInteger("1000000000000000000");
        BigInteger ans=new BigInteger("1");
        for (int i=0;i<N;i++){
            int k=in.nextInt();
            if(k==0)
            {
                ans=BigInteger.valueOf(0);
                flag1=1;
                continue;
            }
            if(flag1==1)
            continue;
            BigInteger x=new BigInteger("1");
            x=BigInteger.valueOf(k);
            if(flag==0)
            ans=ans.multiply(x);
            if(ans.compareTo(y)>0)
            {
                flag=1;
            }
        }
       
        if(ans.compareTo(y)>0)
        {
            System.out.println("-1");
        }
        else 
        {
            System.out.println(ans);
        }
    }
}
