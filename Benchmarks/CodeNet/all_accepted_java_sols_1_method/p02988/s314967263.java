import java.util.*;

public class Main
{
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        ArrayList<Integer> p = new ArrayList<Integer>();

        for(int i = 0; i<n; i++)
        {
            p.add(sc.nextInt());
        }

        int count = 0;
        int index = 0;
        for(int i=0; i<n-2; i++)
        {
            if(p.get(i)<p.get(i+1)){
                if(p.get(i+1) < p.get(i+2)){
                    count++;
                }
            }
            else if(p.get(i)>p.get(i+1)){
                if(p.get(i+1) > p.get(i+2)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}