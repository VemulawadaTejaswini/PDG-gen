import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        int sum = 0;
        for(int i=0;i<N;i++)
        {
            int num = sc.nextInt();
            if(max<num)
            {
                sum += num;
                max = num;
            }
            else
            {
                sum += num;
            }
        }
        sum = sum - max;
        if(max<sum)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
