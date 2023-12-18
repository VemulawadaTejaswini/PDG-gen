
import java.util.*;

class Dice
{
    int a,k=5,j=5;
    Scanner sc = new Scanner(System.in);
    int num [] = new int[6];
    public void copy()
    {
        for(int i = 0; i<6; i++)
       {
           num[i] = sc.nextInt();
       }
       
    }
    public void Ans()
    {
       
         int n = sc.nextInt();
         for(int i = 0; i<n;i++)
       {
            k=5; j=5;
           int f = sc.nextInt();
           int s = sc.nextInt();
           while(k>=0)
           {
               if(f==num[k])
               {
                   k++;
                   break;
               }
               else k--;
           }
            while(j>=0)
           {
               if(s==num[j])
               {
                   j++;
                   break;
               }
               else j--;
           }

         
           System.out.println(num[getRight(j, k)]);
       }
    }
    public int getRight(int f, int s)
    {
        if(f == 1)
        {
            switch(s)
            {
                case 2:
                a = 4;
                break;
                    
                case 3:
                a = 2;
                break;
                    
                case 4:
                a = 5;
                break;
                    
                case 5:
                 a = 3;
                 break;
                }
        }
        if(f==2)
        {
                    
            switch(s)
            {
                case 1:
                a = 3;
                break;
                    
                case 4:
                a = 1;
                break;
                    
                case 6:
                a = 4;
                break;
                    
                case 3:
                a = 6;
                break;
                }
                }
        if(f ==3)
        {
            
            switch(s)
            {
                case 1:
                a = 5;
                break;
                    
                case 2:
                a = 1;
                break;
                    
                case 5:
                a = 6;
                break;
                    
                case 6:
                a = 2;
                break;
                }
        }
        if(f==4)
        {
            switch(s)
            {
                case 5:
                a = 1;
                break;
                    
                case 1:
                a = 2;
                break;
                    
                case 2:
                a = 6;
                break;
                    
                case 6:
                a = 5;
                break;
            }
        }
        if(f==5)
        {
            switch(s)
            {
                case 1:
                a = 4;
                break;
                    
                case 4:
                a = 6;
                break;
                    
                case 6:
                a = 3;
                break;
                    
                case 3:
                a = 1;
                break;
            }
        }
        if(f == 6)
        {
            switch(s)
            {
                case 2:
                a = 3;
                break;
                
                case 3:
                a = 5;
                break;
                
                case 4:
                a = 2;
                break;
                
                case 5:
                a = 4;
                break;
            }
        }
        return a=a-1;
    }
}
class Main
{
    public static void main(String[] args)
    {
     
       Dice dc = new Dice();
       dc.copy();
       dc.Ans();
      
      
    }
}


