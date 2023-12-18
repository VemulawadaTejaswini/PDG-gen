import java.util.*;

 class Main
 {
   public static void main(String args[])
   { //Initial setting
    int a = 0;
    
    int b = 0;
    
    char op = '!';
    
    io(a,b,op);//Input/output
   }
   static void io(int a,int b,char op)
   {
       Scanner sc = new Scanner(System.in);
       
       while(op != '?')
       {
         a = sc.nextInt();
         
         op = sc.next().charAt( 0 );
         
         b = sc.nextInt();
         
         if(op == '+')
         {
            a = a + b;
            
            System.out.println(a);
         }
         if(op == '-')
         {
            a = a - b;
            
            System.out.println(a);
         }
         if(op == '*')
         {
            a = a * b;
            
            System.out.println(a);
         }
         if(op == '/')
         {
            a = a / b;
            
            System.out.println(a);
         }
       }
   }
 }
    
