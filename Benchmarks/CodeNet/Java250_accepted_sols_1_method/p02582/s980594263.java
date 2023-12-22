import java.util.Scanner;
public class Main{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String a = sc.nextLine();
        int max=0,count=0;
        for(int i=0;i<a.length();i++)
        {
            
             if(a.charAt(i)=='R')
             {
                count=0;
                 while(a.charAt(i)!='S' && i<a.length())
                 {
                     count++;
                     
                     i++;
                     if(i==a.length())
                     {
                         break;
                     }
                     
                 }
                 if(max<count)
                 {
                     max=count;
                 }
                
             }
        }
        System.out.println(count);
    }
}