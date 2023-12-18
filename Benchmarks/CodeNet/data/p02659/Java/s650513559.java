import java.util.*;

public class qwerty 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        
        long  n;double k;
        n=in.nextLong();
        k=in.nextDouble();
        long ans=(long)((n*1.0)*k);
        
        System.out.println(ans);
    }   

}
