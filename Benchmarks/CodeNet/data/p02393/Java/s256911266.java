import java.util.*;

 class Main
 {
   public static void main(String args[])
   { 
    answer();
   }
   static  void  answer()
   {
     Scanner sc = new Scanner(System.in);
     
     int n[] = new int[3];
     //input
     for (int i = 0; i < n.length ;i ++)
     {
       n[i] = sc.nextInt();
     }
     
     sort(n);
     
     for (int i = 0; i < n.length ; i ++)
     {
       if(i != 0)System.out.print(" ");
       
       System.out.printf("%d",n[i]);
     }
     System.out.println("");
   }
   static int[] sort(int s[])
   {
     for(int i = 0 ;i + 1 < s.length;i ++)
     {
       for(int j = 0; j + 1 < s.length - i; j ++)
       {
           if(s[j] > s[j + 1])
           {
             int box = s[j];
             
             s[j] = s[j + 1];
             
             s[j + 1] = box;
           }
       }
     }
     return s;
   }
 }
    
