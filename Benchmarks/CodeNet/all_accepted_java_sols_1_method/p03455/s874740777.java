import java.util.*;
public class Main
{
    public static void main (String args[]) throws Exception
    {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        if((a * b) % 2 == 0) {
            System.out.print("Even");
        } else {
            System.out.print("Odd");
        }
    }
}