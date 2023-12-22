import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i=0;i<n;++i) a.add(sc.nextInt());

        String ans = "APPROVED";
        for (int i:a)
        {
            if (i%2!=0) continue;

            if (i%3 !=0 && i%5!=0)
            {
                ans = "DENIED";
                break;
            }
        }

        System.out.println(ans);

        sc.close();
    }
}