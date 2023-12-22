import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n=scanner.nextInt();
        HashMap<Long, Long> map
                = new HashMap<>();
        long sum =0;
        for(int j=0;j<n;j++)
        {
            Long temp=scanner.nextLong();
            if(map.containsKey(temp))
            {
                Long x =map.get(temp);
                x++;
                map.put(temp,x);
            }
            else
            {
                map.put(temp, (long) 1);
            }
            sum+=temp;
        }

        long q= scanner.nextLong();
        for(int j=0;j<q;j++)
        {
            Long b=scanner.nextLong();
            Long c=scanner.nextLong();
            if(map.containsKey(b))
            {
                Long x;
                if(map.containsKey(c))
                {
                    x = map.get(b);
                    sum-=b*map.get(b);
                    Long y=map.get(c);
                    y+=x;
                    sum+=x*c;
                    map.put(c,y);
                }
                else
                {
                    x = map.get(b);
                    sum-=b*map.get(b);
                    map.put(c,x);
                    sum+=c*x;
                }
                map.remove(b);

            }
            System.out.println(sum);
        }
	// write your code here
    }
}
