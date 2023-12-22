import java.util.*;

public class Main {

    public static void main(String []args){
        Scanner in = new Scanner(System.in);

        int n;
        n = in.nextInt();

        SortedMap<String,Integer> poll = new TreeMap<String, Integer>();

        int maxvote = 0;
        for(long i=0;i<n;i++)
        {
            String candidate = in.next();
            if(poll.containsKey(candidate))
            {
                poll.put(candidate,poll.get(candidate)+1);
            }
            else{
                poll.put(candidate,1);
            }
            maxvote = Math.max(maxvote,poll.get(candidate));
        }

        for(String candidate:poll.keySet())
        {
            if(poll.get(candidate)==maxvote)
                System.out.println(candidate);
        }

    }

}
