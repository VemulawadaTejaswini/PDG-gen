import java.util.*;

class Main{
    
   public static void main(String a[]) throws java.io.IOException{
       Scanner scan =new Scanner (System.in);
       boolean [] st =new boolean[31];
       st[0] = true;
       while(scan.hasNext())
           st[scan.nextInt()]=true;
       for(int i=0;i<31;i++)
           if(!st[i])
               System.out.println(i);
   }
}