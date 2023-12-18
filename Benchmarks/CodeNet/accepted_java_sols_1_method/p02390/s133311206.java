
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int S = scan.nextInt();
        int h = 3600;
        int m = 60;
        
                
        System.out.print(S/h +":");
        System.out.print((S%h)/m +":");
         System.out.println((S%h)%m);
                    
    }
}

