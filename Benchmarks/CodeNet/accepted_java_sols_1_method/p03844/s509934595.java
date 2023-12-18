import java.util.Scanner;
public class Main
{
        public static void main(String args[]) throws Exception
        {
                Scanner cin=new Scanner(System.in);
                int a=cin.nextInt();
                String c=cin.next();
                int b=cin.nextInt();
                if(c.charAt(0)=='+') 
                       System.out.println(a+b);
                else 
                       System.out.println(a-b);
                cin.close();
        }
}