import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println((int)(n+Math.pow(n,2)+Math.pow(n,3)));
        String s = sc.next();
        String t = sc.next();
        int count = 0;

        for (int i = 0;i<s.length();++i)
        {
            String ss = s.substring(i,i+1);
            String tt = t.substring(i,i+1);
            if (!ss.equals(tt)) ++count;
        }
        System.out.println(count);
        sc.close();
    }
}