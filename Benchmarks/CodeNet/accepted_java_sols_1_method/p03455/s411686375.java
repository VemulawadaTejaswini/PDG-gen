import java.util.Scanner;
public class Main
{
    public static void main (String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = (a % 2) *  (b % 2);
        if (prod == 0){
            System.out.println("Even"); 
        }else{
            System.out.println("Odd");
        }
    }
}
