import java.util.Scanner;
public class Main 
{ 
    public static void main(String[] args)
    {
       int n,x,p,r,s,t;
       Scanner sc = new Scanner(System.in);
       while((n = sc.nextInt())+(x = sc.nextInt())!=0)
       {
          p =0;
          for(r=1; r<=n; r++)
          {
             for (s = 1; s<=n; s++)
             {
                 for( t = 1; t<=n; t++)
                 {
                     if(t+s+r==x) 
                     {
                         if(r!=s && s!=t && r!=t){
                        p++;
                     }
                 }
             }
          }
       }
          System.out.println(p/6);
    } 
}
}

