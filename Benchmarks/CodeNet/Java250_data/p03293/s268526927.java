import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] argv)
    {
        try{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String msg1,msg2;
        msg1=bf.readLine();
        msg2=bf.readLine();
        Solver s = new Solver(msg1,msg2);
        s.solve();
        s.approach();
        }
        catch(IOException e )
        {
            System.exit(0);
        }
    }
}

class Solver
{
    String patten,target;
    boolean winFlag;
    public Solver(String s1,String s2)
    {
        patten=s1;
        target=s2;
        winFlag=false;
    }
    public void solve()
    {
        String tmp = target+target;
        for( int i=0;i<patten.length();i++)
        {
            winFlag=true;
            for(int j=0;j<patten.length();j++)
            {
                if(tmp.charAt(i+j)!=patten.charAt(j))
                    winFlag=false;
            }
            if(winFlag==true)
                break;
        }

    } 
    public void approach()
    {
        if(winFlag==true)
            System.out.println("Yes");
        else
            System.out.println("No");
            
    }
    
}
