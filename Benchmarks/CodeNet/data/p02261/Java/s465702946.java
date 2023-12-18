
import java.util.Scanner;

class Problem
{
    public void copy(String arr[], int n)
    {
        for(int i = 0; i<n;i++)
        {
            if(i == n-1)
            {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i]+" ");
        }
    }
    public void check(String arr[],int n, String o[])
    {
        Boolean isStable = true;
        for(int i = 0; i<n-1; i++)
        {
            if(Integer.parseInt(arr[i].substring(1))==Integer.parseInt(arr[i+1].substring(1)))
            {
                String a = arr[i];
                String b = arr[i+1];
                for(int j =0; j<n;j++)
                {
                    if(o[j].compareTo(a)==0) break;
                    else if ((o[j].compareTo(b)==0))
                    {
                        isStable = false;
                        break;
                    }
                }   
            }
        }
        if(isStable ==true)System.out.println("Stable");
        else System.out.println("Not stable");
    }
}
class Main
{
    public static void main(String[] args)throws Exception
    {
       Scanner sc = new Scanner(System.in); 
       int n = sc.nextInt(); 
       String [] s = new String[n];
       String [] bs = new String[n];
       String [] ss = new String[n];
       for(int i = 0; i<n; i++)  //Input
       {
           s[i] = sc.next();
           bs[i] = s[i];
           ss[i] = s[i];
       }
     
       for(int i = n; i>0; i--) //Bubble Sort
       {
           for(int j = 0; j<n-1; j++)
           {
               if(Integer.parseInt(bs[j].substring(1))>Integer.parseInt(bs[j+1].substring(1))) 
               {
                   String temp = bs[j+1];
                   bs[j+1] = bs[j];
                   bs[j] =temp; 
               }
           }
       }
       int min;
       for(int i = 0; i<n; i++) //Selection sort
       {
           int indx = i;
           min = Integer.parseInt(ss[i].substring(1));
           for(int j = i+1; j<n; j++)
           {
               if(min>Integer.parseInt(ss[j].substring(1))) 
               {
                   min = Integer.parseInt(ss[j].substring(1));
                   indx = j;
               }
           }
           String temp = ss[i];
           ss[i] = ss[indx];
           ss[indx] = temp;
       }
       Problem p = new Problem();
       p.copy(bs,n);
       p.check(bs, n, s);
       p.copy(ss, n);
       p.check(ss, n, s);
    }
}
       



