
import java.util.Scanner;

class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        if(a < b && b < c)
        System.out.print(a +" " + b +" " + c);
        
         if(a < c && c < b)
        System.out.print(a +" " + c +" " + b);
         
          if(b < a && a < c)
        System.out.print(b +" " + a +" " + c);
          
           if(b < c && c < a)
        System.out.print(b +" " + c +" " + a);
           
            if(c < a && a < b)
        System.out.print(c +" " + a +" " + b);
            
             if(c < b && b < a)
        System.out.print(c +" " + b +" " + a);
    }
}

