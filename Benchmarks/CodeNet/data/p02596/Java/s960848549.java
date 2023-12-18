import java.util.*;
 
public class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int curr = 7;
        int sum = 0;
        boolean found = false;
        for(int i = 1 ; i <= 1000000 ; i++)
        {
            sum += curr%n;
            sum %= n;
            if(sum == 0)
            {
                found = true;
                System.out.println(i);
                break;
            }
            curr = curr*10%n;
        }
        if(!found)
        System.out.println("-1");
    }
}