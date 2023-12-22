import java.util.*;
 
 
class Main {
 
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
       
        int th = in.nextInt();
        int as=in.nextInt();
        int tth = in.nextInt();
        int aas=in.nextInt();
        
        while(th>0)
        {   
            tth-=as;
            if(tth<=0)
            {
                System.out.println("Yes");
                break;
            }
            th-=aas;
            if(th<=0)
            {
                System.out.println("No");
                break;
            }
        }
    }
}