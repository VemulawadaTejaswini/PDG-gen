

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         String w = sc.nextLine();
         int j=0;
         while(true)
         {
             String s =sc.next();
             if(s.compareTo("END_OF_TEXT")==0)break;
             if(s.compareToIgnoreCase(w)==0) j++;
         }
         System.out.println(j);
    }
}
