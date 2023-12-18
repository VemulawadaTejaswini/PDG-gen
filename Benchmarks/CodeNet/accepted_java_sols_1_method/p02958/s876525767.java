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
        int n=sc.nextInt();
        int p[]=new int[n];

        String ans[]={"YES","NO"};

        for (int i=0;i<n;++i)
        {
            p[i]=sc.nextInt();
            if (p[i]!=i+1) ++count;
        }

        if (count==0 || count==2) System.out.println(ans[0]);
        else System.out.println(ans[1]);
        //output
        //System.out.println(String.format("%.0f",answer));
    }
}