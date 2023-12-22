import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 0;i<10000;++i)
//        {
//            if (1000 * i >= n)
//            {
//                System.out.println((1000*i) - n);
//                break;
//            }
//        }
        int n = sc.nextInt();
        int[] count = {0,0,0,0};
        for (int i = 0;i<n;++i)
        {
            String s = sc.next();
            if (s.equals("AC")) ++count[0];
            if (s.equals("WA")) ++count[1];
            if (s.equals("TLE")) ++count[2];
            if (s.equals("RE")) ++count[3];
        }
        System.out.println("AC x " + count[0]);
        System.out.println("WA x " + count[1]);
        System.out.println("TLE x " + count[2]);
        System.out.println("RE x " + count[3]);
        sc.close();
    }
}