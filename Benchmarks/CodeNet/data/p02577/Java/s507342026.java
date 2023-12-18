import java.util.*; 
import java.io.*; 
import java.lang.Math; 
public class Main
{
     public static void main(String []args)
     {
         Scanner in=new Scanner(System.in);
        int t,k,i,j=0,x;
        double m;
        
            String s=in.next();
            for(i=0;i<s.length();i++)
            {
                j+=Integer.valueOf(s.charAt(i));
            }
            if(j%9==0)
            System.out.println("Yes");
            else
            System.out.println("No");
        
     }
}
