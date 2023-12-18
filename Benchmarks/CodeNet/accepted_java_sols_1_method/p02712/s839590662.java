import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long count = 0;
        for(int i=1;i<=N;i++)
        {
            if(i%3==0||i%5==0)
                continue;
            count += i;
        }
        System.out.println(count);
    }
}
