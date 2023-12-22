
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HashSet <String> hs = new HashSet<>();
        int n = sc.nextInt();
        for(int i = 0; i<n; i++)
        {
            String cmd = sc.next();
           if(cmd.compareTo("insert")==0)
           {
               hs.add(sc.next());
           }
           else 
           {
              if(hs.contains(sc.next())) System.out.println("yes");
              else System.out.println("no");
           }
        }
    }
}

