
import java.util.*;


class Main
{
    public static void main(String[] args)throws Exception
    {
        Scanner sc = new Scanner(System.in);
        Deque <String> que = new ArrayDeque <>(); 
        String []s = new String [2];  
        int n = sc.nextInt();
        int quan = sc.nextInt();
        for(int i = 0; i<n;i++) 
        {
            que.add(sc.next()+" "+sc.next());
        }
        Iterator itr = que.iterator();
        int time = 0;
        while(true)
        {
            try
            {
                s= que.getFirst().split(" ");
            }
            catch(NoSuchElementException e) 
            {
                break;
            }
            int num = Integer.parseInt(s[1]);
            if(num>quan) 
            {
                time =  quan + time;
                num = num-quan;
                que.removeFirst();
                que.add(s[0].concat(" "+ String.valueOf(num)));
            }
            else if (num<=quan)
            {
                time =  num + time;
                que.removeFirst();
                System.out.println(s[0]+" "+ time);
            }
        }
    }
}
       



