import java.util.*;
import java.io.*;
public class Main extends PrintWriter {
    Main()
    {
        super(System.out);
    }
    public static void main(String args[]) {
      Main o=new Main();
      o.main();
      o.flush();
      o.close();
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int mod=sc.nextInt();
        int flag=0;
        if(mod==1)
        {
        flag=1;
        println(1);
        }
        else if(mod<7)
        {
            flag=1;
        println(-1);
        }
        else
        {
            int val=7%mod;
            int i;
            for(i=1;i<1e7;i++)
            {
                if(val==0)
                {
                    flag=1;
                    println(i);
                    break;
                }
                val=((val*10)+7)%mod;
            }
            if(flag==0)
            println(-1);
            
        }
        sc.close();
    }
}