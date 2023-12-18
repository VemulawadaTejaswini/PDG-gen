import java.util.Scanner;

class Main
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
       
        int a = scan.nextInt();

        int b = scan.nextInt();
        

        System.out.println(a * b);
        
        System.out.print(" ");

        System.out.print((a * 2) + (b * 2));
    }  
}

