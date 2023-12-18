import java.util.*;

public class Main {
    public static void main (String args[])
    {
       
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        
        //aとbが0以下かつ
        ArrayList<Long> result = new ArrayList<>();
        
        result.add(a*c);
        result.add(a*d);
        result.add(b*c);
        result.add(b*d);

        Long max = Collections.max(result);
        System.out.println(max);
    }
}