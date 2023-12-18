

import java.util.Scanner;

public class Main
{
    
    public void Main()
    {

    }

    public static void main(String[] args)
    {
        int[] setS = new int[128];
        int[] setT = new int[128];
        int total = 0;
        Scanner scan = new Scanner(System.in);
	
        int n = scan.nextInt();
        for(int i=0; i < n; i++)
        {
            int val1 = scan.nextInt();
            //System.out.println(": "+ val1);
            setS[i] = val1;
        }
        
        int q = scan.nextInt();
        for(int i=0; i < q; i++)
        {
            int val2 = scan.nextInt();
            //System.out.println(": "+ val2);
            setT[i] = val2;
        }
        
        boolean flag = true;
        for(int i=0; i < q; i++)
        {
            for(int j=0; j < n; j++)
            {
                if(setS[j] == setT[i] && flag)
                {
                    flag = false;
                    total++;
                }
            }
            flag = true;
        }
        
        System.out.println(total);
        
    }
}