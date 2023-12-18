import java.util.*;
public class Main {
    public static void main(String args[]) {


        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        long val=7%k;
        for(int i=1;i<=1e7;i++)
        {
            if(val%k==0)
            {
                System.out.print(i);
                return;
            }
            //System.out.print(val+" ");
            val=(val*10+7)%k;
            
            
            

        }
        System.out.print("-1");
        return;




    }
}