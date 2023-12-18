
import java.util.*;

class Main
{
    public static void main(String[] args)throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> dq = new ArrayDeque <>();
        
        for(int i = 0; i<n; i++) dq.add(sc.nextInt());
        
        int t = sc.nextInt();
        int ct=0;
        int [] arr = new int[t];
        for(int i = 0; i<t;i++)
        {   
            arr[i] = sc.nextInt();
            Iterator itr = dq.iterator();
            while(itr.hasNext())
            {
                if(arr[i]==Integer.parseInt(itr.next().toString()))
                {
                    itr.remove();
                    ct++;
                    break;
                }
            }
        }
        System.out.println(ct);
    }
}
       



