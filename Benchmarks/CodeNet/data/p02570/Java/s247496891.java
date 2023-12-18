import java.util.*;
public class Solution
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);

        double D = kb.nextDouble();
        double S = kb.nextDouble();
        double T = kb.nextDouble();

        if(D/S <= T)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}