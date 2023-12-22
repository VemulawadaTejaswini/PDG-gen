import java.util.*;

 class Main
 {
   public static void main(String args[])
   { 
    input();
   }
   static void input()
   {
     Scanner sc = new Scanner(System.in);
     
     int a = sc.nextInt();
     
     int b = sc.nextInt();
     
     int c = sc.nextInt();
     //Divisor calculation
     divisor(a,b,c);
   }
   static void divisor(int a,int b,int c)
   {
     int count = 0;
     
     for(int i = a; i <= b; i ++)
     {
       if(c % i == 0)count ++;
     }
     output(count);
   }
   static void output(int answer)
   {
     System.out.println(answer);
   }
 }
    
