import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner stdIn = new Scanner(System.in);
        while(stdIn.hasNext())
        {
            int n = stdIn.nextInt();
            if(n == 0)
            {
                break;
            }
            List<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < n; ++i)
            {
                int a = stdIn.nextInt();
                list.add(a);
            }
            Collections.sort(list);
            int sum = 0;
            for(int i = 1; i < list.size() - 1; ++i)
            {
                sum += list.get(i);
            }
            System.out.println(sum / (list.size() - 2));
        }
    }
}
