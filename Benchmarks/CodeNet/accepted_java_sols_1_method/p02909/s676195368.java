import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //Compute c1 = new Compute();//calc

        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //StringBuilder answer=new StringBuilder();

        //input
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if (s.equals("Sunny")) System.out.println("Cloudy");
        else if (s.equals("Rainy")) System.out.println("Sunny");
        else if (s.equals("Cloudy")) System.out.println("Rainy");
    }
}