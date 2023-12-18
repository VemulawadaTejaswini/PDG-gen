import java.util.*;

public class Main {

    public static void main(String[] args) {
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
        int a=sc.nextInt();
        int b=sc.nextInt();

        if (a+b>max)
        {
            max=a+b;
        }
        if (a-b>max)
        {
            max=a-b;
        }
        if (a*b>max)
        {
            max=a*b;
        }
        System.out.println(max);

        //output
        //System.out.println(String.format("%.0f",answer));
    }
}