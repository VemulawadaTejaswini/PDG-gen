import java.util.*;

public class Main
{
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        ArrayList<Integer> d = new ArrayList<Integer>();

        for(int i = 0; i<n; i++)
        {
            d.add(sc.nextInt());
        }
        Collections.sort(d);
        System.out.println(d.get(n/2)-d.get(n/2-1));
    }
}